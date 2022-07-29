public class copyOnetoAnotherArray {
    public static void main(String[] args) {
        int a[] = {1,3,4};
        int temp[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
            System.out.println(temp[i]);
        }
    }
}
