public class duplicateElements {
public static void main(String[] args) 
{
        int arr[] = {12,23,12,12,23,4};
         
        int temp = 0;
        for (int i = 0; i < arr.length; i++) 
        {  
            for (int j = i+1; j < arr.length; j++) 
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                    arr[j] = 0;

                }
            }
        }
        
}
