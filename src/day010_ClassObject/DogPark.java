package day010_ClassObject;

public class DogPark {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.breed="Neapolian Mastiff";
        dog1.size="large";
        dog1.age=5;
        dog1.color="Black";

        Dog dog2 = new Dog();
        dog2.breed="Mattese";
        dog2.size="small";
        dog2.age=2;
        dog2.color="White";

        // instance methods behaves different at each object because
        // instance variables and instance methods belongs to OBJECT!!!

        dog1.eat();
        dog2.eat();

        Dog dog3 = new Dog();

        System.out.println(dog3.color);   // output will be null 


    }
}
