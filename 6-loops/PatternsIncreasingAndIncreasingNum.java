public class PatternsIncreasingAndIncreasingNum {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int j = 1; j <= (5-i+1); j++) { // kalau j diset <=i, jadinya malah decreasing pattern!
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }    
}

// padahal ini awalnya niatnya mau bikin full kotak aja wkwk
// but ternyata setel range j berpengaruh