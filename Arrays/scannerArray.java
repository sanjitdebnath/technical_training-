import java.util.Scanner;

public class scannerArray {
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
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+ " ");
        }
    }
}
