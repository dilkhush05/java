import java.util.Arrays;
import java.util.Collections;

public class InBiltSorting {
        public static void printarr(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(StringClass[] args) {
        Integer arr[] = {5,2,5,6,4,9,2};
        // Sort in Incressing order
        // Arrays.sort(arr);
    //    Arrays.sort(arr ,2,4 );

    // Sort in decressing order 
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr,2,4, Collections.reverseOrder());


        printarr(arr);

    }
}
