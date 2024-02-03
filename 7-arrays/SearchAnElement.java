public class SearchAnElement {
    public static void main(String[] args) {
        int[] A = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
        int key = 15;  // The element to search for
        for (int i = 0; i < A.length; i++) {
            if (A[i] == key) {
                System.out.println("Element found at index " + i);
                break;  // Stop the loop once the element is found
            }
        }
    }
}