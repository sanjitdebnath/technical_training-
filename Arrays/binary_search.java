public class binary_search {
    public static void main(String[] args) {
        int arr[] = {2,5,6,9,7,8,4};
        int item = 5; 
        int beg = 0, end = arr.length-1,mid = (beg+end)/2;

        while(beg <= end)
        {
            if(item == arr[mid])
            {
                System.out.println("value found at "+ mid);
                break;
            }
            

            if(item > arr[mid])
            {
                beg = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
            
        }
        
        
        
    }
}
