package day7_MethodsCont;

public class VoidMethodWithoutReturn {
    public static void main(String[] args) {
         System.out.println("I started to run in main method");
         run();
        System.out.println("I am running after custom method ");
    }
    public static void run(){
        System.out.println("I am running in custom method");
    }

}
