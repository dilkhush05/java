public class SearchInRotatedArray {
    public static int findearr(int arr[] , int key , int st, int end){
        
        int mid = st + (end - st) /2;

        if(st > end){
            return -1;
        }

        if(arr[mid] == key){
            return mid ;
        }

        if(arr[st] <= arr[mid]){

            if(arr[st] <= key && key <= arr[mid]){
                return findearr(arr, key, st, mid -1);
            }else{
                return findearr(arr, key, mid+1, end);
            }
        }else {
            if(arr[mid] <= key && key <= arr[end]){
                return findearr(arr, key, mid+1, end);
            }else{
                return findearr(arr, key, st, mid -1);
            }
        }

    }
     public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,0,1,2,3};
        int ans = findearr(arr , -1 , 0 , arr.length-1);
        System.out.println("The ans is: " + ans );
     }
}
