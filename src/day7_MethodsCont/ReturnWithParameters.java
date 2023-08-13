package day7_MethodsCont;

public class ReturnWithParameters {
    public static void main(String[] args) {
        System.out.println(sum(4,3));
        System.out.println("sum(1,1) = " + sum(1,1));
        int calculation= 7*5+sum(34,56)/4;
        System.out.println("calculation = " + calculation);
    }
    public static int sum(int num1, int num2){
        
        
        return num1+num2;
    }
    
}
