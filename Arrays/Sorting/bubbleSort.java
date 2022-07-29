public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {2,5,6,8};
        int arr_len = arr.length;
        for (int i = 0; i < arr_len-1; i++) {
            for (int j = 0; j < arr_len-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
