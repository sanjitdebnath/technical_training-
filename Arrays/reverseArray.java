public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,9,8,6};
        int size = arr.length/2;
        // System.out.println(size);
        int temp = 0;
        for (int i = 0; i < size; i++) {
            temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
