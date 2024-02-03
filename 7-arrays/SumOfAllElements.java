public class SumOfAllElements {
    public static void main(String[] args) {
        int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
        int sum = 0;
        for (int x: A) {
            sum += x;
        }
        System.out.println("Sum of all elements in the array: " + sum); 
    }
}

// length is a property not a method, so no need to use ()
// kalau pakai for each loop, var nya itu udh holds value indices, jd gaperlu kaya A[i] lagi
// (dia akses element bukan akses index)