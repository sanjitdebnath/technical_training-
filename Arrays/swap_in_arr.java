// package JavaClass.Technical_Training.Arrays;

public class swap_in_arr {
    public static void main(String[] args) {
        int arr[] = {25,65,98,78,54,15};
        int temp[] = new int[2];
        int nos = 2; // number of swap
        for(int i=0;i<nos;i++)
        {
            temp[i] = arr[i];
        }
        for(int j=0;j<nos;j++)
        {
            arr[j] = arr[(arr.length-nos)+j];
            arr[(arr.length-nos)+j] = temp[j];

        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
         

    }
}
