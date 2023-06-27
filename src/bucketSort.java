public class bucketSort {
    public static void main(String[] args) {
        int[] arr = {20 ,88 ,55 ,91 ,14 ,58 ,25 ,29 ,44};
        getSort(arr);
        int[][] arr_2D={{98,34,100,36,44,64,3,99,59},{20 ,88 ,55 ,91 ,14 ,58 ,25 ,29 ,44},{66 ,62 ,4 ,65 ,49 ,71 ,71 ,24, 12},
                {14 ,3 ,58 ,23 ,12 ,66 ,11 ,45, 36 },{55 ,64 ,35 ,24 ,85 ,73 ,33 ,85 ,46},{94 ,76 ,23 ,36 ,57, 26, 8 ,92 ,17},
                {85 ,68 ,52 ,34, 53, 93 ,4, 37, 34},{70 ,9 ,15, 42, 31, 16, 72, 61, 62 },{11, 38, 34, 21, 81, 9, 45, 68, 11},
                {20 ,83 ,27, 6 ,69 ,26 ,5 ,31 ,8 },{74 ,97 ,11 ,60, 1 ,68 ,14 ,27 ,46}};
        for (int i=0;i<arr_2D.length;i++){
            getSort(arr_2D[i]);
        }
    }

    public static void getSort(int[] arr) {
        int countNum=11;
        int i=0;
        int j=0;
        Integer[][] arrBucket = new Integer[countNum][arr.length];
        while (i<arr.length){
            int section=arr[i]/10;
            if (section<1){
                section=0;
            }
            j=0;
            while (j<arr.length){
                if (arrBucket[section][j]==null){
                    arrBucket[section][j]=arr[i];
                    break;
                }else{
                    j++;
                }
            }
            i++;
        }
        Integer[] result=new Integer[arrBucket[0].length];
        int x=0;
        int y=0;
        int z=0;
        for (int n=0;n<arrBucket[0].length;n++) {
            int k=1;
            int temp;
            while (k < arrBucket[0].length&&arrBucket[n][k]!=null) {
                temp=arrBucket[n][k];
                int m=k;
                while (m>0){
                    if (temp<arrBucket[n][m-1]){
                        arrBucket[n][m]=arrBucket[n][m-1];
                    }else{
                        break;
                    }
                    m--;
                }
                arrBucket[n][m]=temp;
                k++;
            }
        }
        while (x<arrBucket.length){
            y=0;
            z=0;
            while (y<arrBucket[0].length&&z<arrBucket[0].length) {
                if (result[y] == null) {
                    result[y] = arrBucket[x][z];
                    y++;
                    z++;
                } else {
                    y++;
                }

            }
            x++;
        }
        for (int n = 0; n < arr.length; n++) {
            System.out.println(result[n]);
        }
    }




}
