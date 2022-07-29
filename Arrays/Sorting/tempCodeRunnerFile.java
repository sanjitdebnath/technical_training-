int arr[] = {12,34,3,45,43,21,7};
        int arr_len = arr.length;
        for (int i = 0; i < arr_len-i; i++) {
            for (int j = 1; j < arr_len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }