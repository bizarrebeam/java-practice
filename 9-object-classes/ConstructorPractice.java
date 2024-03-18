class Rectangle {
    private int length;
    private int breadth;

    // constructor: the self-same name as the class
    public Rectangle() { // not return anything even void
        length = 1;
        breadth = 1;
    }

    // we can also have parameterized constructor
    // in conclusion, constructor will be called right away when the object is created
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    // we can also have multiple constructors that overload each other
}

public class ConstructorPractice {
    
}
