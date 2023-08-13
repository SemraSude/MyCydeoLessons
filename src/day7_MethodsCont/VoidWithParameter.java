package day7_MethodsCont;

public class VoidWithParameter {
    /*
    write a method that accepts
        number of hour and
        hourly payment and

        show your payment for those hours
     */
    public static void main(String[] args) {
        double hours =3.5;
        double hourlyPayment=35;
        payment(hours,hourlyPayment);

        System.out.println("------------");
        int birthYearOfSemra=2008;
        calculateAge(birthYearOfSemra);
        System.out.println("----------------------------------");

        averageScore(67,75,87,89,81);
        int score1=65,score2=75,score3=87,score4=89,score5=81;
        averageScore(score1,score2,score3,score4,score5);




    }
    public static void payment(double hours,double hourlyPayment){
        // payment=hours*hourlyPayment

        double payment=hourlyPayment*hours;

        System.out.println("payment = " + payment);

    }
/*
write a method that accepts birthyear and displays the age in the console.
Sample input>>calculateAge(2000) Sample output > 18
 */
public static void calculateAge(int birthYear){
    int currentYear=2023;
    int age=currentYear-birthYear;
    System.out.println("age = " + age);
}

/*
*lets calculate average grades
* first1 65
* second 76
* third 87
* fourth 89
* fifth 81
*
* create a void method printing the average of given 5 scores
 */

    public static void averageScore(int score1,int score2, int score3, int score4, int score5){
        double averageScore=(score1+score2+score3+score4+score5)/5;

        System.out.println("averageScore = " + averageScore);


    }





}
