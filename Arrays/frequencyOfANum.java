public class frequencyOfANum {
    public static void main(String[] args) {
        int count = 0;
        int a[] = {23,43,5,6,7,7,7,43,76,76};
        for (int i =0; i < a.length; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                if (a[i]== a[j]) {
                    count++;
                    System.out.println(a[i]+" "+(count+1));
                    
                }
                count = 0;
            }
           
        }

    }
}
