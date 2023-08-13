package day08_MethodOverloadingNloops;

public class A02_Loops {
    public static void main(String[] args) {

        /*for (int count=1;count<5;count++){
            System.out.println("Hello");*/

        // in general we use i,j,k as iterating variable
            for ( int i=1; i<5;i++){
                System.out.println("hello world");
            }
        System.out.println("-----------");

            // lets print the numbers from 1-10

            for (int i=1;i<=10;i++) {
                System.out.println(i);
            }
        System.out.println("*************");

            // counting variable
            int count=1;
            for (int i=0;i<95;i=i+2){
                System.out.println(count++);

            }
        System.out.println("*************");

        int counter=0;
        for (int i=0;i<10;i=i+2){
            System.out.println("i = "+ i);
            counter++;
            System.out.println("counter = " + counter);
        }
/* write a program that displays all
even nembers between 1-100 in same line  */
        System.out.println("*****-------******");

        for (int i=1;i<=10;i++){

                System.out.println(i*2);

        }


        }

    }

