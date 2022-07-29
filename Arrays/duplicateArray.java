import java.lang.reflect.Array;
import java.util.Arrays;
public class duplicateArray {
        public static void main(String[] args) {
            int arr[] = {23,3,45,5,5,5,5};
            // Arrays.sort(arr);
            
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(arr[i]+" "+count+"times");
                }
            }
        }

}
