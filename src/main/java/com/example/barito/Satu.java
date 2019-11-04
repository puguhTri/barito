package com.example.barito;

import java.util.Deque;
import java.util.LinkedList;

public class Satu {

    private static void allSubString(String input) {
        String[] all = {"pro", "gram", "merit", "program", "it", "programmer"};
        input = "programit";

        int n = input.length();

        System.out.println("::: n" + n);

        int start = 0;

        for (int i = start; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                //System.out.print(j);
                //System.out.println(" input ::: " +input.substring(i, j));
                findUtils(all, input.substring(i, j));
            }
            System.out.println("");

        }
    }

    private static void findUtils(String[] all, String input) {
        //System.out.println(all.length);
        // To store current palindromic partition
        Deque<String> result = new LinkedList<String>();
        for (int i = 0; i < all.length; i++) {
            //System.out.println(all[i]);
            if (input.equals(all[i])) {
                //System.out.println(all[i]);
                result.addLast(all[i]);
            }
            /*if (i < input.length()) {
                findUtils(all, input);
            }*/
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        System.out.println("START");
        allSubString("programit");


    }

}
