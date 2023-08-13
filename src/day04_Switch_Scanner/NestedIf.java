package day04_Switch_Scanner;

public class NestedIf {
    public static void main(String[] args) {
        int age = 15;
        if  (age >60) {
            System.out.println("Senior");
        }else if (age>20) {
            System.out.println("Adult");
        }else if (age>12) {
            System.out.println("Teenager");
        }else if (age>3) {
            System.out.println("Child");
        }else{
        System.out.println("Baby");
    }
    }
}
