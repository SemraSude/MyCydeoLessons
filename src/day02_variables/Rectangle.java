package day02_variables;

public class Rectangle {
    public static void main(String[] args) {
         int length;
         int width;
         int area;
         int perimeter;
         length=10;
         width=5;
         area=length*width;
        System.out.println("Area of the rectangle is ");
        System.out.println(area);

        perimeter=2*length + 2*width;
        System.out.println("Perimeter of the rectangle is");
        System.out.println(perimeter);

    }
}
