//find second lasgest element in array 
// step 1 : remove duplicacy 
//tep 2 : then sort array
//step 3 : then print last element 


import java.util.Arrays;
class frequencyArray{
    public static void main(String[] args) {

        // Scanner obj = new Scanner(System.in);

        int arr[] = {12,2,2,34,5};
        int frArray[] = {-1,-1,-1,-1,-1};

        // for (int i = 0; i < frArray.length; i++) {
        //     arr[i] = obj.nextInt();
        //     frArray[i] = -1;
        // }
        // int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                    frArray[j] = 0;
                }
            }
            if (frArray[i] != 0) {
                frArray[i] = count;
            }
        }
        int temp[] = new int[arr.length];
        int m = 0;
        for (int i = 0; i < frArray.length; i++) {
            if (frArray[i] != 0) {
                // System.out.println(arr[i]+" comes "+frArray[i]+" times");
                temp[m] = arr[i];
                m++;
            }
        }
        Arrays.sort(temp);
        // for (int k = 0; k < temp.length; k++) {
        //     System.out.println(temp[k]);
        // }

        // for (int i = 0; i < frArray.length; i++) {
        //     if (frArray[i] == 1) {
        //         System.out.println(arr[i]+" comes "+frArray[i]+" times");
        //     }
        // }
        System.out.println(temp[temp.length-1]);
        System.out.println(temp[temp.length-2]);
    }
}