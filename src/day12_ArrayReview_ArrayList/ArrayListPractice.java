package day12_ArrayReview_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList <String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Lion");

        System.out.println(animals);

        System.out.println("Size of animal ArrayList is " + animals.size());

        animals.add("Tiger");

        System.out.println(animals);

        System.out.println("Size of animal ArrayList is " + animals.size());

        System.out.println("King of the forest is " + animals.get(2));
                                                       // animals[2]

        animals.remove("Dog");   // object should be exact match, other vise it could not find Dog
       // animals.remove("dog");  nothing will be change

        System.out.println(animals);

        System.out.println("Size of animal ArrayList is " + animals.size());

        animals.remove(0);
        System.out.println(animals);

        System.out.println("Size of animal ArrayList is " + animals.size());

        System.out.println("-----------");

        animals.add(1,"Monkey");

        System.out.println(animals);

        System.out.println("-----------");

        animals.add(0,"Snake");

        System.out.println(animals);

        System.out.println("***************");

        for (int i = 0; i < animals.size(); i++) {       // print first only 2 animals

            System.out.println(animals.get(i));

        }
        System.out.println("***************");

        for (String each : animals) {
            System.out.println(each);
        }




    }
}
