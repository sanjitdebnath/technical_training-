import java.util.Scanner;

public class findMaxArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements : ");
        
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Output is : ");

        int store = 0;
        for (int j = 0; j < a.length; j++) {          
            for (int i = j+1; i < a.length; i++) {
                store = a[i]>a[j]?a[i]:a[j];       
            }
        }
        System.out.println(store);
   } 
}
