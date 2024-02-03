public class InsertingElement {
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;
        int n = 6;
        int x = 15;
        int insertAt = 2;

        for (int i = n; i > insertAt; i--) {
            A[i] = A[i - 1]; // karena iteratingnya dimulai dari n=6 menuju habis.
        } // jadi dimulai dari indeks 6 (padahal kan terisi sampai 5, jd emang dishift dari awal)
        A[insertAt] = x;
        n++; // karena nambah 1 elemen
        System.out.println("Array after inserting element: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
