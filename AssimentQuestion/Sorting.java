// import java.lang.runtime.SwitchBootstraps;

public class Sorting {
    public static int[] Bubblesort(int arr[]){
        for(int i =0; i< arr.length -1; i++){
            Boolean swap = false;
            for(int j = 0; j < arr.length - i -1; j++){
                if(arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
         if(!swap){
            return arr;
        }
        }
       
        return arr;
    }


    public static int[] SlectionSort(int arr[]){
        for(int i =0 ; i<arr.length; i++){
            int midpos = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[midpos]){
                    midpos = j;
                }
            }
            //swap 
            int temp = arr[midpos];
            arr[midpos] =arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] InserctionSort(int arr[]){
        for(int i = 1; i< arr.length; i++){
            int curr = arr[i];
            int prev = i -1;
            while (prev >= 0 &&  arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev --;
            }
        arr[prev + 1] = curr;
        }
        return arr;
        
    }
    public static void printarr(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(StringClass[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // Bubblesort(arr);
        // SlectionSort(arr);
        InserctionSort(arr);
        printarr(arr);
    }
}
