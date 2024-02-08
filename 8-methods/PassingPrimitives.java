public class PassingPrimitives {
    void changePrimitive(int x) {
        x = 30; // want to change to 30
    }
    public static void main(String[] args) {
        int x = 10;
        PassingPrimitives p = new PassingPrimitives();
        p.changePrimitive(x);
        System.out.println(x); // but 10 remains unchanged
    }
}

// passing primitives to method: passing a copy of the actual value
// if the method changes the value, it's changing the copy, not the original value