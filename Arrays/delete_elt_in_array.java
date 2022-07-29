public class delete_elt_in_array {
    public static void main(String[] args) {
        int arr[] = {2,6,9,8,7};
        int pos=2;
        for (int i = pos; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        for (int j = 0; j < arr.length-1; j++) {
            System.out.println(arr[j]);
        }
    }
}
