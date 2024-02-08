public class OverloadCalculateArea {
    static double area(double r) {
        return Math.PI * r * r;
    }

    static double area(double l, double b) {
        return l * b;
    }
    
    static double area(double a, double b, double h) {
        return (a + b) * h / 2;
    }

    public static void main(String[] args) {
        System.out.println("Area of circle: " + area(5));
        System.out.println("Area of rectangle: " + area(5, 10));
        System.out.println("Area of trapezoid: " + area(5, 10, 15));
    }
}
