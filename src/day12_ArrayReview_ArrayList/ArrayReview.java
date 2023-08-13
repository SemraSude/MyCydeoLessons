package day12_ArrayReview_ArrayList;

import java.util.Arrays;

public class ArrayReview {
    public static void main(String[] args) {

        // 1. declare an int array named nums

      //  int [] nums ;          declare and create in two statements
      //  nums = new int[15];

        int [] nums = new int[15];  // preferred usage

        // 2. declare create and initialize at the same statement

        int[] nums2 ={11,22,33,44,55,66};


        // 3. assigning values to elements

        // assign 00 to nums 2 index 0;

        System.out.println(Arrays.toString(nums2));

        nums2 [3] = 00;

        System.out.println(Arrays.toString(nums2));

        // reach the element at index 4

        System.out.println( nums2[4] + 5);

        for (int i = 0; i < nums2.length; i++) {  // itar
            System.out.println(nums2[i]);

        }
        System.out.println("**************");

        double [] grades = {33.3,45.6,66,88,55.5,100};

        for (int i = 0; i <= 2; i++) {   // i want first 3 grades to be printed

            System.out.println(grades[i]);

            System.out.println("**************");

        }
        for (int i = 0; i < grades.length; i++) {

            if (grades[i]>60) {

                System.out.println(grades[i] + " is greater than 60, student pass");
            }
        }




    }
}
