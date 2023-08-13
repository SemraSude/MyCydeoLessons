package day08_MethodOverloadingNloops;

public class A04_LoopsTasks2 {
    public static void main(String[] args) {
        oddNumbers();
    }
    public static void oddNumbers(){
        for (int i=5;i<=140;i++){
            if (i%2==1){
                System.out.print(i + "\t");
            }
        }
    }

}
