package test;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.asList;

public class SearchPaar {
    public static void main(String[] args) {
//        int[] arr = {9, 4, 6, 3, 8, 7, 9, 0};
        Integer[] arr = {5, 10, 20, 32, 50, 60, 65, 80};

        int key = 70;
        ArrayList<Paar> res;

//        res = correctDouble(arr, key);
        correctDouble2(arr, key);
//        for (Paar p:res) {
//            System.out.println("=====================================");
//            System.out.println("First index: " + p.getIndex1());
//            System.out.println("Second index: " + p.getIndex2());
//        }
//        for (Paar p:res) {
//            System.out.println(p);
//        }
    }

    public static ArrayList<Paar> correctDouble(int[] arr, int key) {
        boolean found = false;
        ArrayList<Paar> res = new ArrayList<>();
//        int arrSize = arr.size();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] + arr[j] == key) {
                    res.add(new Paar(i, j));
                    found = true;
                }
            }
        }
        if (!found) {
            res.add(new Paar(-1, -1));
        }
        return res;
    }

    public static void correctDouble2(Integer[] arr, int key) {
//        Integer[] arr1 = {0,1,2,3,4};
        List<Integer> l = Arrays.asList(arr);
        Map<Integer, Integer> map = new HashMap<>();
//        ArrayList<Paar> res = new ArrayList<>();
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            a = key - arr[i];
            if(a > arr[i] || i <= 1) {
                b = l.indexOf(a);
                if (b >= 0) {
                    System.out.println("pair is " + i + " " + b);
                }
            }
            else {
                break;
            }
        }
    }
}
