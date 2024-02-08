public class MethodOverloading {
    static int max(int x, int y) {
        return x > y ? x : y;
    }

    static float max(float x, float y) {
        return x > y ? x : y;
    }
    public static void main(String[] args) {
        System.out.println(max(10, 100));
        System.out.println(max(90.5f, 100.5f));
    }
    
}

// different parameters could be handled by the same method name
// allows us to write the same method name as long as the params differentiate it

// be careful with passing integer and float, they could be handled by the same method
// e.g, when i have both method accepting byte and float, but i pass integer, it will be handled by the float method
// due to the fact that integer LITERALS is a bigger data type than byte, so it will be handled by the float method
// except i'm declaring the type explicitly

// byte only be called by byte
// integer could be called with float too