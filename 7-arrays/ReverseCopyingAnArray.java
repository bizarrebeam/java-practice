public class ReverseCopyingAnArray {
    public static void main(String[] args) {
        int A[] = { 8, 6, 10, 9, 2, 15, 7, 13, 14, 11 };
        int B[] = new int[10];
        int indexB = 0;

        // my mistake is i>0 skip the first element of A
        for (int i = A.length-1; i >=0; i--) {
            B[indexB] = A[i];
            indexB++;
        }

        System.out.println("Array A: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nArray B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
