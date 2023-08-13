package day08_MethodOverloadingNloops;

public class MethodOverloadingNLoops {
    public static void main(String[] args) {
        sum(2,3.0);

    }
    public static void sum(int num1,int num2){
         int result=num1+num2;
        System.out.println("result = " + result);
    }
    // void sum(int, int)

    // adding additional parameter
    public static void sum(int num3,int num4,int num5){
        int  result=num3+num4;
        System.out.println("result = " + result);
    }
    // void sum(int ,int)

    //chancing the data type of one input
    public static void sum(int num3,double num4){
        double  result=num3+num4;
        System.out.println("result = " + result);
    }
    // void sum(int, double)

    //chancing the input orders of parameters
    public static void sum(double num3,int num4){
        double  result=num3+num4;
        System.out.println("result = " + result);
    }
    // void sum(double, int )

    // what options do i have without changing the name of the method
    // using same method name can i create diferent method -- yes, but
    // we can add an additional parameter
    //chancing the data type of one input
    //chancing the input orders of parameters


}
