public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {31, 33, 27, 15, 42, 11, 40, 5, 19, 21};
        int l=0;
        int r=arr.length-1;
        mergeSort(arr,l,r);
        for (int n = 0; n < arr.length; n++) {
            System.out.println(arr[n]);
        }
        int[][] arr_2D={{98,34,100,36,44,64,3,99,59},{20 ,88 ,55 ,91 ,14 ,58 ,25 ,29 ,44},{66 ,62 ,4 ,65 ,49 ,71 ,71 ,24, 12},
                {14 ,3 ,58 ,23 ,12 ,66 ,11 ,45, 36 },{55 ,64 ,35 ,24 ,85 ,73 ,33 ,85 ,46},{94 ,76 ,23 ,36 ,57, 26, 8 ,92 ,17},
                {85 ,68 ,52 ,34, 53, 93 ,4, 37, 34},{70 ,9 ,15, 42, 31, 16, 72, 61, 62 },{11, 38, 34, 21, 81, 9, 45, 68, 11},
                {20 ,83 ,27, 6 ,69 ,26 ,5 ,31 ,8 },{74 ,97 ,11 ,60, 1 ,68 ,14 ,27 ,46}};
        int i=0;
        int le=0;
        int ri=arr_2D[0].length-1;
        while (i < arr_2D.length) {
            mergeSort(arr_2D[i],le,ri);
            for (int m = 0; m < arr_2D[0].length; m++) {
                System.out.println(arr_2D[i][m]);
            }
            i++;
        }
    }

    public static int[] mergeSort(int[] arr,int l,int r){
        int mid=(l+r)/2;
        if (l<r){
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
        return arr;
    }
    public static void merge(int[] arr,int l,int m,int r){
        int[] tempArr=new int[r-l+1];
        int i=l;
        int j=m+1;
        int k=0;
        while (i<=m&&j<=r){
            if (arr[i]<=arr[j]){
                tempArr[k]=arr[i];
                k++;
                i++;
            }else{
                tempArr[k]=arr[j];
                k++;
                j++;
            }
        }
        while (i<=m){
            tempArr[k]=arr[i];
            k++;
            i++;
        }
        while (j<=r){
            tempArr[k]=arr[j];
            k++;
            j++;
        }
        for (int n=0;n<tempArr.length;n++) {
            arr[n+l]=tempArr[n];
        }
        }

}
