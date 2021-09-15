package com.company;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        // ex. 1

//        int[] numbers = {2, 5, -3, 11, 193, -2};
//        int sum = 0;
//
//        for (int i = 0; i < numbers.length; i++)
//        {
//            System.out.println(i);
//            sum = sum + numbers [i];
//        }
//
//
//        System.out.println("Sum of all elements in this array is: " + sum);


        // ex. 2

//        int [] nums = {3, 5, 0, 11, 1};
//        int count = 0;
//        int s = 0;
//
//        for (int i = 0; i <= 4 && i >= 0; i++)
//        {
//            if (!(nums [i] == 0));
//            {
//                s = s + nums[i];
//                count++;
//
//            }
//        }
//
//        if (count == 0)
//            System.out.println (nums[0]);
//        else
//            System.out.println (s % count);


        // ex. 3

//        int [] values = {-3, 2, 5, 4, 7};
//        boolean result = true;
//        int n = 1;
//
//        for (result = true; n < 5; n++)
//        {
//            if (values [n] < values [n-1])
//            {
//                result = false;
//                n++;
//            }
//        }
//
//        out.println (result);



        // ex. 4

//        int [] original = {5, 4, -7, -2, -1};
//        System.out.print ("original: ");
//        for (int i = 0; i < original.length; i++)
//        {
//            System.out.print (original[i] + " ");
//        }
//
//        System.out.println();
//        System.out.print("reverse: ");
//        for (int i = original.length - 1; i >= 0 ; i--)
//        {
//            System.out.print(original[i]+ " ");
//        }



        // ex. 5

        int [] original = {-3, 2, 6, -11};
        int sum = 0;

        System.out.print ("original array: ");

        for (int i = 0; i < original.length; i++)
        {
            System.out.print (original[i] + " ");
        }

        out.println();
        System.out.print ("cumulative sum: ");

        for (int i = 0; i < original.length; i++)
        {
            sum += original[i];
            out.print (sum + " ");
        }


        // ex. 6 - prints out only the first value, would need a list... I don't know how to do that

//        int[] array = {4, -3, -5, 9, 1, 11};
//
//        int m = 1;
//        int smaller = array [0];
//        int larger = array [0];
//
//            for (int i = 0; i < array.length - 1; i++)
//
//
//            {
//                if (array [i] < m) smaller = array [i];
//                if (array [i] > m) larger = array [i];
//            }
//
//            out.print("array: ");
//            for (int a = 0; a < array.length; a++) System.out.print (array [a] + " ");
//
//            out.println();
//            out.println ("m: " + m);
//            out.println ("smaller: " + smaller);
//            out.println ("larger: " + larger);
    }
}
