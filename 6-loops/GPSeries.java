import java.lang.Math;

public class GPSeries {
    public static void main(String[] args) {
        int a = 2;
        int r = 3;
        int n = 10;

        // kesalahan gweh: math pow itu return double, hasil printingnya jd ada koma
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(a * (int)Math.pow(r, i)); // supaya print angka terakhir gk ada koma
            } else {
                System.out.print(a * (int)Math.pow(r, i) + ", ");
            }
        }
    }
}
