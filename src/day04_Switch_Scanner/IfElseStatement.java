package day04_Switch_Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        boolean isDaytime = false;
        boolean isSurvivalMode = true;
        System.out.println("We have a lots of lines of code here");
        if (isDaytime && isSurvivalMode) {              // only if is possible
            System.out.println("no monsters");
        }else {                                          // only else is not possible
            System.out.println("Then it is nightTime and you can see monsters");
        }
        System.out.println("We are out of else block");

        int num= -23;
        // even numbers= 2 4 6 8 10
        // odd numbers = 1 3 5 7 9 11

        if (num % 2 ==0 ) {
            System.out.print(num + " is Even");
        }else {
            System.out.print(num + " is Odd");
        }
        if (num >0){
            System.out.println(num + " is positive ");
        }else{
            System.out.println(num + " is negative");
        }





    }
}