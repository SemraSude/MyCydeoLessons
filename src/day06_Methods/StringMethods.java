package day06_Methods;

public class StringMethods {
    public static void main(String[] args) {

        String str="Cydeo is the best of the best  ";
        //Length()
        int lengthOfString=str.length();
        System.out.println(lengthOfString);  //.soutv  // result is 19

        //charAt() returns the char on selected index--

        char selectedChar=str.charAt(6);
        System.out.println(selectedChar);

         // indexOf() returns index number of selected char or string
        // for string abc indexAt("abc") indexOf('a')

        int indexNumber=str.indexOf("best");
        System.out.println(indexNumber);         //.sout

        // trim() is trims the spaces at he begin and end of the string
        str=str.trim();
        System.out.println(str);                 //.sout

        // equals() we are using this to compare two string
        String str2="Cydeo is the best of the best";
        //str.equals(str2) true or false
        System.out.println(str.equals(str2));
        String str3="Cydeo is the BEST of the BEST";
        System.out.println(str.equalsIgnoreCase(str3));

        // contains() it checks if it has chosen string
        System.out.println(str3.contains("Cydeo"));

        System.out.println("---------");

        String try1="abc";
        String try2="ABC";
        System.out.println(try1.equalsIgnoreCase(try2));


    }
}
