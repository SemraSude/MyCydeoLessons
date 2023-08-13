package day08_MethodOverloadingNloops;public class Task6InDay7 {
    public static void main(String[] args) {
        System.out.println( isSummer(60));
        System.out.println(isSummer(80));
        System.out.println(isSummer(90));
        System.out.println(isSummer(100));
        System.out.println(isSummer(101));
    }
    public static boolean isSummer(int temperature){
        if (temperature<60){
            return false;
        }else if(temperature>=60&&temperature<=90){
            System.out.println("deers play, it is summer");
            return true;
        }else if (temperature>90&&temperature<=100){
            System.out.println("deers looking for shade, but  it is summer");
            return true;
        }else{
            System.out.println("invalid input, please enter a value below 100");
            return false;
        }




    }





}
