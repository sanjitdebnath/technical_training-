public class merge_two_arr {
    public static void main(String[] args) {
        int arr1[] = {20,25,36,86,98};
        int arr2[] = {15,59,16,56,27,45};
        int new_arr[] = new int[arr1.length + arr2.length];
        // System.out.println(new_arr.length);
        int index  = 0;
            for (int j = 0; j < arr1.length; j++) {
                new_arr[index]= arr1[j]; 
                index++;
            }
            for(int n=0;n<arr2.length;n++)
            {
                new_arr[index] = arr2[n];-
                index++;
            }
        
        for(int k=0;k<new_arr.length;k++)
        {
            System.out.println(new_arr[k]);
        }
    
    }
}
