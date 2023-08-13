package day7_MethodsCont;

public class VoidMethodsWithParameters {
    public static void main(String[] args) {
        hello("Joshep");
        String name= "Arben";
        hello(name);
        System.out.println("---------");

        sum(23.1,2.1);
    }

    // hello -- variable
    // hello() -- method
    // Hello -- class
    public static void hello(String name){

        System.out.println("Hello " + name);

    }

    public static void sum(double num1,double num2){
        double sum;
        sum=num1+num2;

        System.out.println("Sum of two values equals to "+ sum );


    }










}
