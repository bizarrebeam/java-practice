public class FindMaxElementInArray {
    static int maxValue(int[] A) {
        int max = A[0]; // Assume the first element is the maximum
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i]; // Update max if current element is greater
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
        System.out.println("The maximum element is " + maxValue(A));
    }
    
}