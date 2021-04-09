package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        for (int i = 0; i < graph.getVertexCount(); i++) {
            int v1 = ThreadLocalRandom.current().nextInt(0,10);
            int v2 = ThreadLocalRandom.current().nextInt(0,10);

            graph.addEdge(v1, v2);
            System.out.printf("vertex %d: %d, %d\n", i, v1, v2);
        }
//        System.out.println(graph.getAdjList(1));
//
//        DepthFirstPaths dfp = new DepthFirstPaths(graph, 2 );
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));
//        System.out.println(dfp.hasPathTo(3));


        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.hasPathTo(0));
        System.out.println(bfp.pathTo(5));
        System.out.println(bfp.pathLength(bfp.pathTo(5)));
        System.out.println(bfp.hasPathTo(5));

    }
}
