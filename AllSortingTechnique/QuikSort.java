public class QuikSort {
    public static void printarr(int arr[]){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[] , int st, int end){
        if(st >= end){
            return;
        }
    int pInd = partition(arr , st ,end );
    quicksort(arr, st, pInd -1);
    quicksort(arr, pInd +1, end);
    }

    public static int partition(int arr[] , int st, int end ){
        int pvoit = arr[end];
        int i = st -1;

        for(int j =  st; j< end ; j++){
            if(arr[j] <= pvoit){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }
            i++;
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp; 

            return i;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,5,6,7,9,3,4,-1};
        quicksort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
