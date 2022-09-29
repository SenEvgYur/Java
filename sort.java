public class sort {
    public static void bubbleSort(int[] ar) { 
        boolean sort = false;
        int temp;
        while(!sort) {
            sort = true;
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i+1]) {
                    temp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = temp;
                    sort = false;
                }
            }
        }
     }
    
}
