package day06_Methods;

public class GetAnAxeMethod {
    public static void main(String[] args) {

        String player; //variable decleration
        int diamonds;
        int sticks=5;

        player="Alex";
        diamonds=4;

        System.out.println("Can i craft an axe?");

        getAxe();
    }

    public static void getAxe() {
        int diamonds = 4;
        int sticks = 5;

        if (diamonds >= 3 && sticks >= 2) {
            System.out.println("You can craft a diamond axe");
        } else {
            System.out.println("Not enough resources, go to mine and dig more");
        }
        }
    }