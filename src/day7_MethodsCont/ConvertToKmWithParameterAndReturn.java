package day7_MethodsCont;

public class ConvertToKmWithParameterAndReturn {
    public static void main(String[] args) {
       // System.out.println("convertMilesToKm(233.5) = " + convertMilesToKm(233.5));
        convertMilesToKm(345.43);
    }
    public static double convertMilesToKm(double miles){
        // 1 mile is 1.609
        // constant variables -- once you define it you can not change it. 'final'
        final double CONVERSIONRATE=1.609;
        double km=miles*CONVERSIONRATE;
        System.out.println("km = " + km);
        return km;
    }


}
