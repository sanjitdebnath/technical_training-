class ds{
    public static void main(String args[]){
       int a[] = new int[10];
       a[0] = 12;
       a[1] = 13;
       for (int i : a) {
        if (i==0) {
            break;
        }
        System.out.print(i+" ");
        
       }
       System.out.println();
       int b[] = {2,3,34,32,12,3,56,4};
       for(int i = 0;i<b.length;i++){
        System.out.print(b[i]+" ");
       }
    }
}