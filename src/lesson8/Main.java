package lesson8;

import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int x = Integer.MIN_VALUE;
//        System.out.println(x);
//
//        System.out.println(Math.abs(x));
//
//        System.out.println(Integer.toBinaryString(x));
//        System.out.println("0"+Integer.toBinaryString(0x7fffffff));


        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>();
//        chm.put(1,"one");
//        chm.put(2,"two");
//        chm.put(3,"three");
//        chm.put(4,"four");
//        chm.put(5,"five");
//
//        System.out.println(chm.get(3));

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int key = random.nextInt(100);
            chm.put(key,"");
        }

        System.out.println(chm);

        for (int i = 0; i < chm.size(); i++) {
            if (random.nextInt(10) < 2 && chm.contains(i)) {
                chm.delete(i);
                System.out.println("Deleted key number " + i);
            }
        }

        System.out.println(chm);
    }
}
