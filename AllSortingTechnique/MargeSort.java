public class MargeSort {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void margeSort(int arr[], int st, int end) {
        if (st >= end) {
            return;
        }
        int mid = st + (end - st) / 2;
        margeSort(arr, st, mid);
        margeSort(arr, mid + 1, end);
        marge(arr, st, mid, end);
    }

    public static void marge(int arr[] , int st , int mid, int end){
        int temp[] = new int[end - st +1];
        int i = st;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

         while(j <= end){
            temp[k++] = arr[j++];
        }

        for(k= 0 , i = st ; k < temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,8,6,3,4,9,4,1};
        margeSort(arr, 0 , arr.length -1);
        printarr(arr);
    }
}
