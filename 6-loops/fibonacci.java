public class fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int series = 10;

        System.out.print(n1 + ", " + n2 + ", ");
        for (int i = 0; i < (series-2); i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (i == (series-3)) { // supaya print angka terakhir gk ada koma
                System.out.print(n3);
            } else {
                System.out.print(n3 + ", ");
            }
        }


    }
}
