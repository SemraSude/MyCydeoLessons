package day12_ArrayReview_ArrayList;

import java.util.StringTokenizer;

public class ForEachLoop {
    public static void main(String[] args) {

        double [] grades = {33.3,45.6,66,88,55.5,100};

        for ( double each : grades){
            System.out.println(each);
        }
        System.out.println("+++++++++++++++");
int counter =0;
        // I want to know the number of grades less than 60
        for (double grade : grades) {
            if (grade < 60 ){
                counter++;
            }
        }
        System.out.println(counter + " of the grades are less than 60");

    }
}
