package lesson2;

import java.awt.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        String[] strArr ;
//        strArr = new String[5];
//        String[] strArr1 ={"A", "BBBB","CCC"};

//        int[] arr = new int[10];
//
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = i;
//        }
//
//
////
////        for (int i = 0; i <arr.length ; i++) {
////            if(arr[i] %2 == 0){
////                arr[i]+=10;
////            }
////        }
//
//        System.out.println(Arrays.toString(arr));

//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.addAll(Arrays.asList(3, 6, 7, 2, 43, 56, 2, 2, 5));
//
//        System.out.println(list);
////        list.remove((Integer) 2);
////        list.removeIf(x -> x > 5);
////        list.removeAll(Arrays.asList(2));
//        System.out.println(list);


//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(5);
//        mal.add(2);
//        mal.add(1);
//        mal.add(3);
//        System.out.println(mal);
//
//        mal.add(4, 9);
//        System.out.println(mal);

//        mal.remove(9);
//        System.out.println(mal);

//        System.out.println(mal.indexOf(9));


//       MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(5);
//        msal.add(9);
//        msal.add(2);
//        msal.add(4);
//        msal.add(1, 10);
//
//        System.out.println(msal);
//
//        System.out.println(msal.binaryFind(4));


//        MyArrayList<Integer> mal = new MyArrayList<>(15);
//        Random rand = new Random();
//        for (int i = 0; i <10 ; i++) {
//            mal.add(rand.nextInt(20));
//        }
//        System.out.println(mal);
//
////        mal.selectionSort();
////        mal.insertionSort();
////        mal.bubbleSort(Comparator.naturalOrder());
//        mal.bubbleSort(Comparator.reverseOrder());
//
//        System.out.println(mal);


//        MyArrayList<String> myArrayList = new MyArrayList<>();
//        myArrayList.add("aaa");
//        myArrayList.add("BBB");
//        myArrayList.add("bbbbbbb");
//        myArrayList.add("ccc");
//        myArrayList.add("AAAAA");
//        myArrayList.add("xxx");
//        myArrayList.add("YYYyy");

//        System.out.println(myArrayList);
//        myArrayList.bubbleSort(Comparator.naturalOrder());
//        myArrayList.bubbleSort(Comparator.comparingInt(String::length));
//        myArrayList.bubbleSort(Comparator.comparingInt(String::length).reversed());
//        myArrayList.bubbleSort(Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase));
//        System.out.println(myArrayList);

//        MyArrayList<Integer> checkLength = new MyArrayList<>();
//        for (int i = 0; i < 15; i++) {
//            checkLength.add(i);
//        }
//        System.out.println(checkLength);
//        System.out.println("size: " + checkLength.size() + ", capacity: " + checkLength.getCapacity());
//
//        for (int i = 15; i < 45; i++) {
//            checkLength.add(i);
//        }
//        System.out.println(checkLength);
//        System.out.println("size: " + checkLength.size() + ", capacity: " + checkLength.getCapacity());

        MyArrayList<Integer> malBubble = new MyArrayList<>(1_000_000);
        MyArrayList<Integer> malInsertion = new MyArrayList<>(1_000_000);
        MyArrayList<Integer> malSelection = new MyArrayList<>(1_000_000);

        float startTime, deltaTime;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int item = random.nextInt(50);
            malBubble.add(item);
            malInsertion.add(item);
            malSelection.add(item);
        }

        //System.out.println(malInsertion);
        startTime = System.nanoTime();
        malInsertion.insertionSort();
        deltaTime = (System.nanoTime() - startTime) * 0.000000001f;
        System.out.println("Insertion Sort finished in " +  deltaTime + "sec");

        //System.out.println(malSelection);
        startTime = System.nanoTime();
        malSelection.selectionSort();
        deltaTime = (System.nanoTime() - startTime) * 0.000000001f;
        System.out.println("Selection Sort finished in " + deltaTime + "sec");

        //System.out.println(malBubble);
        startTime = System.nanoTime();
        malBubble.bubbleSort();
        deltaTime = (System.nanoTime() - startTime) * 0.000000001f;
        System.out.println("Bubble Sort finished in " + deltaTime + "sec");

//        Insertion Sort finished in 665.98834sec
//        Selection Sort finished in 2824.7463sec
//        Bubble Sort finished in 4858.95sec
    }

}
