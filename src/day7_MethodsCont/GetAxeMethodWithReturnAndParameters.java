package day7_MethodsCont;

public class GetAxeMethodWithReturnAndParameters {
    public static void main(String[] args) {
        System.out.println( checkResourcesToCraftADiamondAxe(3, 2)); //happy scenario
        System.out.println( checkResourcesToCraftADiamondAxe(3, 1)); //negative scenario

    }
    // I will provide number of diamonds and sticks and I want to check if I can craft a diamond axe
    //I need 3 diamonds and 2 sticks to create a diamond axe

    public static String checkResourcesToCraftADiamondAxe(int diamond, int stick){
        if(diamond>=3&&stick>=2){
            return "You can craft a diamond axe";
        }else {
            return "Not enough resources, collect more";
        }

    }

}
