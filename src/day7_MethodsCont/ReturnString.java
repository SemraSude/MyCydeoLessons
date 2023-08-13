package day7_MethodsCont;

public class ReturnString {
    public static void main(String[] args) {
        System.out.println("Welcome to the class");
        System.out.println(name());
        String name= "Joshep";
        System.out.println("Welcome to the class\t " + name());
        name = "yasin";                     // they are completely diferent because they re in diferent methodss
        String user = " Yasin";

    }
    // in return methods we need to put 2 things
    //1. return type at the header
    //2. return keyword and returning value

    public static String name(){
        String name="Semra";
        String user = "Yasin ";         //  //
        return name;
    }



}
