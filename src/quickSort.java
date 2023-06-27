public class quickSort {
    public static void main(String[] args) {
        int[] arr = {333, 6123, 1, 4,655, 679, 654, 32, 7,34,56};
        int lo = 0;
        int hi = arr.length - 1;
        QuickSort(arr, lo, hi);
        for (int n = 0; n < arr.length; n++) {
            System.out.println(arr[n]);
        }
        int[][] arr_2D={{98,34,100,36,44,64,3,99,59},{20 ,88 ,55 ,91 ,14 ,58 ,25 ,29 ,44},{66 ,62 ,4 ,65 ,49 ,71 ,71 ,24, 12},
                {14 ,3 ,58 ,23 ,12 ,66 ,11 ,45, 36 },{55 ,64 ,35 ,24 ,85 ,73 ,33 ,85 ,46},{94 ,76 ,23 ,36 ,57, 26, 8 ,92 ,17},
                {85 ,68 ,52 ,34, 53, 93 ,4, 37, 34},{70 ,9 ,15, 42, 31, 16, 72, 61, 62 },{11, 38, 34, 21, 81, 9, 45, 68, 11},
                {20 ,83 ,27, 6 ,69 ,26 ,5 ,31 ,8 },{74 ,97 ,11 ,60, 1 ,68 ,14 ,27 ,46}};
        int i=0;
        while (i < arr_2D.length) {
            int l=0;
            int h=arr_2D[0].length-1;
            QuickSort(arr_2D[i],l,h);
            for (int m = 0; m < arr_2D[0].length; m++) {
                System.out.println(arr_2D[i][m]);
            }
            i++;
        }
    }

    public static void QuickSort(int arr[], int lo, int hi) {
        int pivotNum = arr[lo];
        int i = lo;
        int j = hi;
        int num;
        while (i < j) {
            while (arr[j] >= pivotNum && i < j) {
                j--;
            }
            while (arr[i] <= pivotNum && i < j) {
                i++;
            }
            if (i < j) {
                num = arr[j];
                arr[j] = arr[i];
                arr[i] = num;
            }
        }
        arr[lo] = arr[i];
        arr[i] = pivotNum;
        if(i>lo) {
            QuickSort(arr, lo, j - 1);
        }
        if(j<hi) {
            QuickSort(arr, j + 1, hi);
        }
    }
}