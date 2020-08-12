package lesson7;

import java.util.LinkedList;

public class FirstPath {
    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;

    FirstPath(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public LinkedList<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = v;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

    public int pathLength(LinkedList<Integer> path) {
        return (path == null) ? -1 : path.size();
    }
}
