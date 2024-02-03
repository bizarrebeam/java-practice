public class PatternsPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5 - i + 1); j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= i-1; j++) { //biar segitiganya lancip
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= (5 - i + 1); j++) {
                System.out.print(" " + " ");
            }
            
            System.out.println();
        }
    }
}

// ini pattern 2 for loop pertama, trs dicopas lg.
// tapi urutan penempatan nya beda, 2 yg awal kan space 'geser' arterisk,
// 2 yang akhir normal.
// dua dua segitiganya sama sama increasing