public class BinarySearch {
    public static void ReverseArray(int arr[] ){
        int start = 0, end = arr.length - 1;

        while(start <  end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;

            start++;
            end--;
            
        }
    }
    public static int binarysearch(int number[], int key){
        int start = 0 ;
        int end = number.length -1 ; 

        while (start <= end) {
            int mid = (start + end) / 2;

            if(number[mid] ==  key){
                return mid;
            }
            if(number[mid] < key){
                start = mid +1 ;
            }else {
                end = mid -1;
            }
            
        }
        return -1;

    }

    public static void ArrayPairs(int arr[]){
        for(int i= 0; i < arr.length; i++){
            int curr = arr[i];
            for(int j = i+1; j < arr.length ; j++){
                System.out.print("[" + curr + "," + arr[j] + "]" + " ");
            }
            System.out.println();
        }
    }

    public static int PairCountInArray(int arr[]){
        int lnth = arr.length;

        int count = (lnth *(lnth -1))/2;
        return count;
    }
    public static void main(StringClass[] args){
        // int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        // int key = 11;

        // int indrx = binarysearch(numbers , key);

        // System.out.println("The index of key is : " + indrx );


        int arr[] = {12,13,14,15,16,17};

    //     ReverseArray(arr);

    //     for(int i= 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
         ArrayPairs(arr);

         System.out.println("Total number of Pairs is  : " + PairCountInArray(arr));
    }

   
}
