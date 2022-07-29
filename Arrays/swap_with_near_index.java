// package JavaClass.Technical_Training.Arrays;

public class swap_with_near_index {
    public static void main(String[] args) {.
        int  arr[] = {1 ,2 ,3 ,4 ,5};
        for (int i =0; i <arr.length-1; i=i+2) {

            int temp = arr[i]; //1
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}


/*
    1 2 3 4 5
    2 1 4 3 5
 */