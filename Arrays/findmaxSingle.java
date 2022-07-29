
public class findmaxSingle {
    public static void main(String[] args) {
        int a[] = {23,435,4,5,67};
        int big = a[0];
        for (int i =1; i < a.length; i++) {
            if(big<a[i]){
                big = a[i];
            }
        }
        System.out.println(big);
    }
    
}