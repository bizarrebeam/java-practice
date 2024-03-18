class Rectangle {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
    
    // setter change the og value of the properties
    // even if beforehand i just declare the variable or already assign the value
    // it'd always updated by the setter method
    public void setLength(double l) {
        length = l; // nama variabelnya jangan sama, nanti java ngambek
    }
    
    public void setBreadth(double b) {
        breadth = b;
    }

    // inget kalau getter returntype nya sesuai variabelnya
    // kalau setter void
    // both diset public

    // best practice of encapsulation: use getter/setter for method instead of the properties variable
    public double area() {
        // return length * breadth;
        return getLength() * getBreadth();
    }

    public double perimeter() {
        // return 2 * (length + breadth);
        return 2 * (getLength() + getBreadth());
    }

    public boolean isSquare() {
        // return length == breadth;
        return getLength() == getBreadth();
    } 
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setBreadth(5);

        // when i set Lenght and Breadth, i'm calling setter method and passing arg
        // inside the setter method, the value assigned to the length variable
        // then, for another applicative method, because they're within the same class,
        //    it can access the value of length and breadth


        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Is square: " + r1.isSquare());

        // call getter kalau beneran mau print value private variabelnya

        System.out.println("Length: " + r1.getLength());
        System.out.println("Breadth: " + r1.getBreadth());
    }
}