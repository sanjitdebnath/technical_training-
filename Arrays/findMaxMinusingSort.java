import java.util.Arrays;

public class findMaxMinusingSort {
    public static void main(String[] args) {
        int a[] = {23,5,65,3,23,89};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Min is : "+a[0]+"\n");
        System.out.println("max is : "+a[a.length-1]);
    }
}
