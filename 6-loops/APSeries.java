public class APSeries {
    public static void main(String[] args) {
        int a = 5;
        int d = 5;
        int n = 10;

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(a + i * d); // supaya print angka terakhir gk ada koma
            } else {
                System.out.print(a + i * d + ", ");
            }
        }
    }
}

