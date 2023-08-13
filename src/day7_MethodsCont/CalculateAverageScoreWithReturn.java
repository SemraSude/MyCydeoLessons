package day7_MethodsCont;

public class CalculateAverageScoreWithReturn {
    public static void main(String[] args) {
        int studentA=78;
        int studentB=87;
        int studentC=75;
        System.out.println("averageScore(studentA,studentB,studentC) = " + averageScore(studentA, studentB, studentC));

    }
    public static double averageScore(int score1,int score2,int score3){

        return (score1+score2+score3)/3;
    }

}
