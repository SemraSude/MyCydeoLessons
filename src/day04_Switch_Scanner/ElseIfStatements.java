package day04_Switch_Scanner;

public class ElseIfStatements {
    public static void main(String[] args) {
        int age = -12;
        if (age>0 && age<120) {
            if (age > 60) {
                System.out.println("Senior");
            } else if (age > 20) {
                System.out.println("Adult");
            } else if (age > 12) {
                System.out.println("Teenager");
            } else if (age > 3) {
                System.out.println("Child");
            } else {
                System.out.println("Baby");
            }
        }else{
            System.out.println("Not a valid age");
        }
    }
}
