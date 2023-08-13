package day011_ClassObject_Constructor_Array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

    //    int [ ]scores;
      //  scores = new int [5];

        int [] scores = new int[5];  // index is start from 0 , length is start from 1

        scores [0] = 100;
        scores [1] = 90;
        scores [2] = 80;
        scores [3] = 70;
        scores [4] = 60;

        System.out.println(scores[3]);
        System.out.println(Arrays.toString(scores));
    }
}
