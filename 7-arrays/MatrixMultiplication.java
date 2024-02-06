public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int B[][] = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int C [][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    
        System.out.println("Product of two matrices is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", C[i][j]);
            }
            System.out.println();
        }
    }
}