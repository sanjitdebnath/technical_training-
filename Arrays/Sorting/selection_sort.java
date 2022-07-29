// package Sorting;

class sort {
    void first_select() {
        int arr[] = { 5, 6, 9, 8, 7, 2, 3 };
        int arr_size = arr.length;

        for (int i = 0; i < arr_size - 1; i++) {
            for (int j = i + 1; j < arr_size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr_size; i++) {
            System.out.println(arr[i]);
        }
    }
    void second_select() {
        int arr[] = { 5, 6, 9, 8, 7, 2, 3 };
        int arr_size = arr.length;

        for (int i = 0; i < arr_size; i++) {
            int min = i;
            for (int j = i + 1; j < arr_size; j++) {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i = 0; i < arr_size; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class selection_sort {
    public static void main(String[] args) {
        sort obj = new sort();
        obj.second_select();
    }

}
