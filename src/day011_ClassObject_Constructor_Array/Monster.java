package day011_ClassObject_Constructor_Array;

public class Monster {
    String name;
    String color;
    int strength;

    public boolean approach(){
        System.out.println(name +" is approaching ");
        return true;
    }
    public void goAway(){}
    public void attack(){}
    public void kill(){}

    @Override
    public String toString() {      // right click > generate > toString
        return "Monster{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", strength=" + strength +
                '}';
    }
}
