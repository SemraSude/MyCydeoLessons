package day06_Methods;

public class ConvertToKm {
    public static void main(String[] args) {

        System.out.println("I am driving a car in US");
        System.out.println("I have been driving 5 hours");
        System.out.println(" My average speed is 65 miles per hour ");
        System.out.println("How many km i have passed");

        convertKm();
    }

    public static void convertKm() {
        // 1 miles equals to 1.609 km
        // conversion rate 1.609
        int hour=5;
        int avaregeSpeed=65;
        double conversionRate=1.609;
        // 5hours*65mph*1.609  int*int*double  double

        double kilometers=hour*avaregeSpeed*conversionRate;

        System.out.println("kilometers = " + kilometers);

    }


}
