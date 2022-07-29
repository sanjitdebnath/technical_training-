class frequencyArray1{
    public static void main(String[] args) {
        int arr[] = {23,3,45,5,5};
        int frArray[] = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                    frArray[j] = visited;
                }
            }
            if (frArray[i] != visited) {
                frArray[i] = count;
            }
        }
        for (int i = 0; i < frArray.length; i++) {
            if (frArray[i] != visited) {
                System.out.println(frArray[i]);
            }
        }
    }
}