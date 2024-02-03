public class RotatingLeftAnArray {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int temp = A[0];
        for (int i = 0; i < A.length - 1; i++) {
            A[i] = A[i + 1];
        } // my mistake was changing the last A into temp inside the loop
        A[A.length - 1] = temp;
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

// it would cause the output to be 2 3 4 5 6 7 8 9 10 1
// because i set the last element to be the first element (A[0])