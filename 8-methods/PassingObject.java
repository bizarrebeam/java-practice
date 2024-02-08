public class PassingObject {
    void changeObject(int[] arr) {
        arr[0] = 30;
    }

    public static void main(String[] args) {
        int[] arr = {10};
        PassingObject p = new PassingObject();
        p.changeObject(arr);
        System.out.println(arr[0]); // get 30 as expected
    }
}

// passing objects to method: passing a copy of the reference to the object
// so the actual reference and the copy reference both point to the same object
// if the method changes the object, it's changing the actual object

// it's different if i make a new object inside the method like new int[] {30}
// then the copy reference will point to the new object, not the actual object