public class MethodPractice {
    static void change(int X[], int index, int value) {
        X[index] = value;
    }
    public static void main(String[] args) {
        int A[] = { 1, 3, 5, 7, 9, 11 };
        // main is a static method, so we can't call non-static method directly
        // change(A, 2, 10); // Error
        // create a new object here or simply give static in the method above
        change(A, 2, 15);

        for (int x : A) {
            System.out.println(x);
        }
    } 
}

// here i could modify the actual array (bcs it's a reference type and i'm passing the reference to the method)
// but if i pass a primitive type, it will not be modified

// so method have params it's formal parameters
// and the actual parameters are the values that are passed to the method 
// --only 1 way in java: passing parameters
// and it's always the actual parameters that are passed to the method (by making a copy of the actual parameters)
// but, if it's primitive, it's copying the calue
// if it's an object, it's copying the reference 