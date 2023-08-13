package day13_WrapperClasses_OOP;

import java.util.ArrayList;
public class WrapperClassesPractice {
    public static void main(String[] args) {

        ArrayList <Double> grades = new ArrayList();
              // int is primitive DataType

        int a = 10;
        Integer b =a; //autoBoxing
        System.out.println(b);

        grades.add(56.6);
        grades.add(70.0);
        grades.add(100.0);
        grades.add(90.5);
        System.out.println(grades);

        grades.add(80.0);
        System.out.println(grades);

        grades.add(2,80.0);
        System.out.println(grades);

        // we are trying to find a program that will find the sum of grades
        // double sum = 56.6+ 70.0 + 100.0 + ...
        System.out.println("-------------");
        double sum = 0;

        for (Double each :grades) {
            sum=sum+each;    //sum+=each
        }
        System.out.println("Sum of the grades is " + sum);

        double total= 0;
        for (int k = 0; k < grades.size(); k++) {
            total += grades.get(k);
        }

        System.out.println("Total of the grades is "+total);





    }
}
