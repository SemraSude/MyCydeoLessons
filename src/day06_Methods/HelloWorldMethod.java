package day06_Methods;

public class HelloWorldMethod {
    public static void main(String[] args) {

        System.out.println("Inside of main method");
        System.out.println("Just before my custom method");

        helloWorld();  //calling a method

        System.out.println("end of the code!");
    }

    public static void helloWorld(){

        System.out.println("Hello World!");

    }




}
