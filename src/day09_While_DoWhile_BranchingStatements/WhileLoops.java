package day09_While_DoWhile_BranchingStatements;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
       learnWhileLoop();
       printNumbers();
        System.out.println("--------------");

       // String str="klxnjflgivhmvhıdhvd";

        Scanner scan =new Scanner(System.in);
        int num=5;
        while (num<10){
            System.out.println("Please enter a number ");
            num=scan.nextInt();

            System.out.println("num = " + num);
        }
        System.out.println("-----");
         doWhile();

    }
    public static void learnWhileLoop(){
        System.out.println("Im learning while looop");
        int x=5;
        while (x>0){
            System.out.println("Im still practicing while loop until i learn");
            x=x-2;
        }
    }
/* initialize a variable with value 25. while its decreasing by 1 at each iteration,
        print in the loop while its greater than 10
       */
       public static void printNumbers(){
           int i=25;
           while (i>10)
           {
               // where is the code repeating at each operation?  Here in  method body
               System.out.println(i);
               i--;   // dont forget to put incrementor or decrementor inside while loop body
           }
       }

       public static void doWhile(){
           int num =65;

           do {
               System.out.println("num = " + num);
               num++;

           }while (num<70);
       }




       // look for i:
    // I will present a sentence and my while loop is going to look for i letter
    // while loop is going to run as long as there is no i character in the string
       // when it finds i character loop stops
     //when my loop finds i it will  print found i
    // when my loop can not find i it will print i not found








}


