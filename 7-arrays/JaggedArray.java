public class JaggedArray {
    public static void main(String[] args) {
        int A[][];
        A = new int[3][]; // 3 rows, but columns are not defined
        A[0] = new int[2]; // 3 columns in 1st row
        A[1] = new int[4]; // 2 columns in 2nd row
        A[2] = new int[6]; // 4 columns in 3rd row
    }
}
