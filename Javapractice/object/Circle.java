package object;

public class Circle {
    public static int radius;
    public Circle() {
        this.radius = 5;
    }
    public Circle(int radius) {
        this.radius = radius;
    }

    public static double getArea() {
        return (radius * radius * 3.14);
    }
    public static double getCircumference() {
        return (2 * radius * 3.14);
    }

    public static void anSwer(){
        System.out.println(getArea());
        System.out.println(getCircumference());
    }


}
