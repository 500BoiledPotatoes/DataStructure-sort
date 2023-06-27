public class sort_1_A {
    public static void main(String[] args) {
        int[] arr = {31, 33, 27, 15, 42, 11, 40, 5, 19, 21};
        insertionSort(arr);
        selectionSort(arr);
        int[][] arr_2D = {{71, 2},{64, 8}, {31, 56}, {98, 1}, {3, 6}, {59, 837}, {49, 58},{61, 8}};
        insertionSort_2D(arr_2D);
        selectionSort_2D(arr_2D);
    }

    public static void insertionSort(int[] arr) {
        int i=1;
        int compareNum;
        while (i < arr.length) {
            compareNum=arr[i];
            int j=i;
            while (j>0){
                if (compareNum<arr[j-1]){
                    arr[j]=arr[j-1];
                }else{
                    break;
                }
                j--;
            }
            arr[j]=compareNum;
            i++;
            //
        }
        for (int n=0;n<arr.length;n++) {
            System.out.println(arr[n]);
        }
    }
    public static void insertionSort_2D(int[][] arr) {
        int i=1;
        int compareNum;
        int[] tempArr1;
        int[] tempArr2;
        while (i < arr.length) {
            compareNum=arr[i][0];
            tempArr1=arr[i];
            tempArr2=arr[i];
            int j=i;
            while (j>0){
                if (compareNum<arr[j-1][0]){
                    arr[j]=arr[j-1];
                    arr[j]=arr[j-1];
                }else{
                    break;
                }
                j--;
            }
            arr[j]=tempArr1;
            arr[j]=tempArr2;
            i++;
        }
        for (int n=0;n<arr.length;n++) {
            System.out.println(arr[n][0]);
        }
    }
    public static void selectionSort(int[] arr){
        int i=0;
        int k=0;
        int j=0;
        while (i< arr.length-1) {
            j = 0;
            k=0;
            while (k < arr.length-1-i) {
                if (arr[j] < arr[k+1]) {
                    j = k + 1;
                }k++;
            }
            if (arr.length != j) {
                int x = arr[arr.length - 1-i];
                arr[arr.length - 1-i] = arr[j];
                arr[j] = x;
            }
            i++;
        }
        for (int n=0;n<arr.length;n++) {
            System.out.println(arr[n]);
        }
    }
    public static void selectionSort_2D(int[][] arr){
        int i=0;
        int k=0;
        int j=0;
        while (i< arr.length-1) {
            j = 0;
            k=0;
            while (k < arr.length-1-i) {
                if (arr[j][0] < arr[k+1][0]) {
                    j = k + 1;
                }k++;
            }
            if (arr.length != j) {
                int[] x = arr[arr.length - 1-i];
                arr[arr.length - 1-i]= arr[j];
                arr[j] = x;
            }
            i++;
        }
        for (int n=0;n<arr.length;n++) {
            System.out.println(arr[n][0]);
        }
    }
}