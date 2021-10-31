package com.company;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        // ex. 1

/*        int[] numbers = {2, 5, -3, 11, 193, -2};
        int sum = 0;

        out.print ("Elements of array: ");

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print (numbers [i] + " ");
            sum = sum + numbers [i];
        }

        out.println();
        System.out.println("Sum of all elements in this array is: " + sum);*/



        // ex. 2
        // The program finds the average of [nums] values when i is not 0

/*        int [] nums = {3, 5, 0, 11, 1};
        int count = 0;
        int s = 0;

        for (int i = 0; i <= 4 && i >= 0; i++)
        {
            if (!(nums [i] == 0));
            {
                s = s + nums[i];
                count++;

            }
        }

        if (count == 0)
            System.out.println (nums[0]);
        else
            System.out.println (s % count);*/



        // ex. 3
        // The purpose of this program is to check if numbers are in increasing order, or not at least in decreasing order

/*        int [] values = {1, 2, 3, 4, 5};
        boolean result = true;
        int n = 1; // because n-1 (=-1) would be out of bounds

        for (result = true; n < 5; n++)
        {
            if (values [n] < values [n - 1])
            {
                result = false;
                n++;
            }
        }

        out.println ("Are numbers in ascending order: " + result);*/



        // ex. 4

/*        int [] original = {5, 4, -7, -2, -1};

        System.out.print ("original: ");

        for (int i = 0; i < original.length; i++)
        {
            System.out.print (original[i] + " ");
        }

        System.out.println();
        System.out.print("reversed: ");

        for (int i = original.length - 1; i >= 0 ; i--)
        {
            System.out.print(original[i]+ " ");
        }*/



        // ex. 5

/*        int [] original = {-3, 2, 6, -11};
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
        }*/


        // ex. 6

        int[] array = {4, -3, -5, 9, 1, 11};

        int m = 1;
        int smaller;
        int larger;

            out.print("array: ");
            for (int i : array)
                System.out.print(i + " "); // prints the array

            out.println();
            out.println ("m: " + m); // prints m

        out.print ("smaller: ");
        for (int k : array) {
            if (k < m) {
                smaller = k;
                out.print (smaller + " "); // prints smaller values
            }
        }

         out.println();
         out.print ("larger: ");
        for (int j : array) {
            if (j > m) {
                larger = j;
                out.print (larger + " "); // prints larger values
            }
        }
    }
}
