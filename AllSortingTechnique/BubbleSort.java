// package AllSortingTechnique;

public class BubbleSort {
    public static int[] BubbleShort(int arr[]){
        int ln = arr.length;

        for(int i = 0; i< ln-1; i++){
            Boolean swap = false;
            for(int j = 0; j< ln - i -1; j++){
                if(arr[j] > arr[j+1]){   //when we change the > arrow to < its arrange in decending order 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
                
            }
            if (!swap) {
            break;
        }
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
        BubbleShort(arr);
        printarr(arr);

    }
}
