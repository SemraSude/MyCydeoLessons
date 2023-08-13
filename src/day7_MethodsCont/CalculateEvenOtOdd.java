package day7_MethodsCont;

public class CalculateEvenOtOdd {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(67894305889766890765467864534789786978976898567748647867d));

    }

    // Create return method that accepts an integer and returns String telling Even or Odd

    public static String evenOrOdd(double number ){
        // even number%2==0
        // odd number%!=0, ==1
        if (number%2==0) {   // inside an if parantheses we can put a boolean condition true or false
            return "the number "+number+ " is even ";
        }else{
            return "the number "+number+ " is odd";
        }



    }



}