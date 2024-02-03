public class IncreasingSizeOfArray {
    public static void main(String[] args) {
        int A[] = { 8, 6, 10, 9, 2 };
        int B[] = new int[10];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        A = B;
        B = null;

        System.out.println("Array A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }
}

// we simply create a new array B with a larger size and copy the elements of A into B.
// Then we assign the reference of B to A and set B to null
// cause we want the variable itself to increase its size, not just a mere copy