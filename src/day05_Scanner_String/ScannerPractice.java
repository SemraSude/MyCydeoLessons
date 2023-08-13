package day05_Scanner_String;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("In order to make calculations please enter an integer value for length of the Rectangle:");

        int length=in.nextInt();            // input should be integer

        System.out.println("In order to make calculations please enter an integer value for width of the Rectangle:");

        int width=in.nextInt();            // input should be integer
        System.out.println("If you want to get perimeter of Rectangle please type 0, if you want to get area of the Rectangle please type 1");
        int input=in.nextInt();  // this will be either 0,1 or someting else

        if(input==0) {
             int perimeterOfRectange = 2* (length+width);
            System.out.println("perimeterOfRectangle=" + perimeterOfRectange);
        }
        else if(input==1) {
            int areaOfRectange =  length*width;
            System.out.println("areaOfRectangle=" + areaOfRectange);
        } else  {
            System.out.println("Wrong input please enter 0 or 1");
        }



    }
}
