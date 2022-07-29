import java.util.concurrent.ForkJoinPool;

// package JavaClass.Technical_Training.Arrays;

public class shifting_in_arr {
    public static void main(String[] args) {
        
        int arr[] = {25,98,5,7,65,23};
        int nos= 2,last_swap = (arr.length-1)-nos,
        new_last_index = arr.length - nos;
        int temp[] = new int[nos];

        for (int i = 0; i < temp.length; i++) {
            temp[i]= arr[(arr.length-nos)+i];
            // System.out.println(temp[i]);
        }
        for(int j=0;j<new_last_index;j++)
        {
           arr[(arr.length-1)-j] = arr[(arr.length-last_swap)-j];
        }
        arr[0] = temp[0];
        arr[1] = temp[1];
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
