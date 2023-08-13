package day09_While_DoWhile_BranchingStatements;

public class LoopsTasks {
    public static void main(String[] args) {
        printİntSumEvenNOdd();
        printSquared();
    }
    // write a program that displays sum of even and odd numbers between 1 and 100 excluding 100

    public static void printİntSumEvenNOdd(){
        int sumOfEven=0;
        int sumOfOdd=0;
        for (int i = 1; i < 100; i++) {

            if (i%2==0){
              sumOfEven+=i;          // <-- sumOfEven=sumOfEven+i;
            }else {
                sumOfOdd+=i;
            }
        }
        System.out.println("sumOfEven = "+sumOfEven+" sumOfOdd = "+ sumOfOdd );

    }
    //print number and numbersquared from 1 to 10

    public static void printSquared(){
        System.out.println("number\tnumberSquared");
        for (int i=1; i<=30; i++){
            System.out.println(i+"\t \t \t"+ i*i);

        }

    }


}
