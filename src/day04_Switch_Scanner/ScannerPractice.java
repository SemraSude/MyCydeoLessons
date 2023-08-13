package day04_Switch_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name="";
        int age=0;
        System.out.println("Please enter your name");

        name = input.next();

        System.out.println("Please enter your age ");
        age = input.nextInt();

        System.out.println("name is "+ name);
        System.out.println("age is "+ age);



    }
}
