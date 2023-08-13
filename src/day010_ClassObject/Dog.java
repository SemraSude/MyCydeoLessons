package day010_ClassObject;

public class Dog {
    String breed;       // variables which is not created in a main method called instance variables
    String size;
    int age;
    String color;

    // the methods which do not have static keyword is called instance method
    public void eat(){
        System.out.println(breed + " is eating!!");
    }
    public void sleap(){
        System.out.println(breed + " is sleeping!!");
    }
    public void sit (){
        System.out.println(breed + " is sitting!!");
    }
    public void run(){
        System.out.println(breed + " is running!!");
    }
}
