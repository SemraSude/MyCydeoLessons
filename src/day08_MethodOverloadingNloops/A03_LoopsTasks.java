package day08_MethodOverloadingNloops;

public class A03_LoopsTasks {
    public static void main(String[] args) {
        evenNumbers();
        System.out.println("-----------");
        evenNumberss();
        System.out.println("-----------");
        evenNumbers(45,65);
    }
    /* write a program that displays all
even numbers between 1-100 in same line  */

    public static void evenNumbers(){

        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.print(i + "\t");
            }

        }
    }
    public static void evenNumberss() {

        for (int i = 2; i <= 100; i = i + 2) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }

        }

    }


    public static void evenNumbers(int startingNumber, int endingNumber){

        for (int i=startingNumber;i<=endingNumber;i++){
            if (i%2==0){
                System.out.print(i + "\t");
            }

        }
    }









    }





