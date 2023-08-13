package day09_While_DoWhile_BranchingStatements;

public class BranchingStatements {
    public static void main(String[] args) {

        //break continue
        practicebreak();
        System.out.println("--------");
        practicecontinue();
    }

    public static void practicebreak() {
        for (int i = 0; i < 10; i++) {

            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        System.out.println("outside for loop");
    }

    public static void practicecontinue() {
        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue;   // skips rest of the loop
            }
            System.out.println(i);

        }
    }
}