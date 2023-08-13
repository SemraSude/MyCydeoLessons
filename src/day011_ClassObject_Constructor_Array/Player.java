package day011_ClassObject_Constructor_Array;

public class Player {
    String name;
    String hairColor;
    int health;
    int weapon;
    int food;

    public void walk(){

    }
    public void eat(){

    }
    public void fight(){
        System.out.println(name + " is fight ");
    }
    public void runaway(){

    }




    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", health=" + health +                // right click > Generate > toString()
                ", weapon=" + weapon +
                ", food=" + food +
                '}';
    }


    public Player(String name, String hairColor, int health, int weapon, int food) {
        this.name = name;
        this.hairColor = hairColor;
        this.health = health;               // right click > Generate > constructors
        this.weapon = weapon;
        this.food = food;
    }
}
