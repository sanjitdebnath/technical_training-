import java.util.Scanner;

public class insert_elt_in_arr {
    public static void main(String[] args) {
        int item = 98, pos = 3;
        Scanner st = new Scanner(System.in);
        System.out.print("enter the size : ");
        int size = st.nextInt();
        int arr[] = new int[size + 1];
        // [25,36,69,54,21,57,_]
        System.out.println("enter the value : ");
        for (int i = 0; i < size; i++) {
            arr[i] = st.nextInt();
        }
        // for(int j = size)
    }
}
