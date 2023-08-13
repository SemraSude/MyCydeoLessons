package day010_ClassObject;

public class BranchingStatementPractice {
    // look for i:
    // I will present a sentence and my while loop is going to look for i letter
    // while loop is going to run as long as there is no i character in the string
    // when it finds i character loop stops
    //when my loop finds i it will  print found i
    // when my loop can not find i it will print i not found

    public static void main(String[] args) {
String word="jklfi";
lookfori(word);
    }
    public static void lookfori (String str){
        int i=0;
        while (str.charAt(i)!='i'){
            i++;
            if (i>=str.length()){
                break;
            }
        }
        if(i==str.length()){
             System.out.println("i not found");
        }else {
             System.out.println("i found");
}

    }
}
