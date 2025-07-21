

public class SlectionSort {

    public static int[] SlectionSortFun(int arr[]){
        for(int i = 0; i< arr.length; i++){
            int minposition = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] > arr[minposition]){   //when we change the < arrow to > its arrange in decending order 
                    minposition = j;
                }
            }
            //swap
            int temp = arr[minposition];
            arr[minposition] = arr[i];
            arr[i] = temp;
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
        SlectionSortFun(arr);
        printarr(arr);

    }
}
