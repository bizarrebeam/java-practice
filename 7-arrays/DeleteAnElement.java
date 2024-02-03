public class DeleteAnElement {
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;
        int currentElements = 6; // by default, this int already exceed the exist place on the array
        int deleteAt = 2;

        for (int i = deleteAt; i < currentElements - 1; i++) {
            A[i] = A[i + 1];
        }
        currentElements--; // because we delete 1 element
        System.out.println("Array after deleting element: ");
        for (int i = 0; i < currentElements; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

//jadi ini dimulai dari index ke-2, overwrite dengan index di sebelah kanannya
// terus loopnya maju terus sampai currentElements - 1 (karena kan memang kehapus 1)
