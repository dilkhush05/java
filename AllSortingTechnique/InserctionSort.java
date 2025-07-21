

public class InserctionSort {


    public static int[] InserctionSortFun(int arr[]){
        for(int i = 1; i <  arr.length; i++){
            int curr = arr[i];
            int prev = i -1;
            while( prev >= 0 && arr[prev] > curr){  //arr[prev] > curr   change the sing  of this > to < to get output decrising order;
                arr[prev +1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        return arr;
    }
        public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(StringClass[] args) {
        int arr[] = {5,2,5,6,4,9,2};
        InserctionSortFun(arr);
        printarr(arr);

    }
}
