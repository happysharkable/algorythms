package lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        final int MIN = -100;
        final int MAX = 100;
        final int TOTAL = 20;
        int balanced = 0;

        MyTreeMap[] maps = new MyTreeMap[TOTAL];
        for (int i = 0; i < maps.length; i++) {
            maps[i] = new MyTreeMap<Integer, String>();
            int count = 0;
            do {
                int key = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
                maps[i].put(key, Integer.toString(count++));
            } while (maps[i].height() < 6);
            if (maps[i].isBalanced()) balanced++;
        }

        System.out.println(String.format("Number of arrays created: %s\nNumber of balanced arrays: %s\nBalanced arrays percent: %s%%", TOTAL, balanced, balanced * 1f/ TOTAL * 100));
    }
}
