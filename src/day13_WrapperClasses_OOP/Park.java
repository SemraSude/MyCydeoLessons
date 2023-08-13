package day13_WrapperClasses_OOP;

public class Park {

    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.age=5;

        dog.age=5;
        System.out.println(dog.age);

       // dog.name; // private variables cannot be reached from outside

        Bird parrot = new Bird();

        parrot.eat();



         final double PI= 3.14; // we are making this variable constant
        int R =4;

        // pi=6.14;   we cannot assign a new value to a final variable

        double perimeter = 2*PI*R;



        

    }

}
