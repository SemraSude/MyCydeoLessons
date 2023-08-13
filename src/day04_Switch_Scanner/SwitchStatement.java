package day04_Switch_Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        String weather ="Windy";                   // must be exact match

        switch (weather) {
            case "sunny":
                System.out.println("Go to beach");
            break;                         // break is important

            case "rainy":
                System.out.println("Stay at home and practice Java");
            break;

            case "windy":
                System.out.println("Go fly Kite ");
            break;
            default:
                System.out.println("In either case Practice Java in the evening ");

        }
        System.out.println("we are out of Switch statement");

    }
}
