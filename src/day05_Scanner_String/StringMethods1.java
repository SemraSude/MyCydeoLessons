package day05_Scanner_String;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {
        String str="Java";
        //          0123
       // what will be input
        // what will be output


        // length() output: int definition: number of characters in a string
        int lengthOfStr = str.length();
        System.out.println("length of Str= " + "length of Str");

        // charAt(int index)
        //definition: it gives index is outOfRange it returns StringIndexOutOfBound Expection
        // output: is a character char

        char firstLetterOfString= str.charAt(0);
        System.out.println("firstLetterOfString=" + firstLetterOfString );


        // Letter Guess Game
        String savedName="Osmaniye";
        char firstLetterOfTheSavedName= savedName.charAt(0);

        System.out.println("----------------------");
        Scanner in =new Scanner(System.in);

        System.out.println( "Hey, guess the first letter of my secret word");
        String input=in.next();
        char inputFirstLetter=input.charAt(0);

        if (inputFirstLetter == firstLetterOfTheSavedName) {
            System.out.println("You Won!");
        }else {
            System.out.println("Sorry Not This Time! ");
        }


    }
}
