public class FindingMaximumElement {
    public static void main(String[] args) {
        int[] A = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
        int max = A[0]; // Assume the first element is the maximum
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i]; // Update max if current element is greater
            }
        }
        System.out.println("The maximum element is " + max); 
    }
}
