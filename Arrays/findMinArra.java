public class findMinArra {
    
    public static void main(String[] args) {
        int a[] = {23,435,4,5,67};
        int small = a[0];
        for (int i =1; i < a.length; i++) {
            if(small>a[i]){
                small = a[i];
            }
        }
        System.out.println(small);
    }
}
