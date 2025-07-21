
public class TwiceAvlabelOrNot {

    public static void FunTwiceAvlabelOrNotain(int arr[]) {
        int n = arr.length;

        for(int i =0; i< n; i++){
            for(int j = i+1; j< n; j++){
                if(arr[i] == arr[j]){

                    System.out.println("there is a duplicate element");
                }
            }
        }
        System.out.println("There is no duplicate element");    
    }
    public static void main(StringClass[] args) {
        int arr[] = {1,2,3,4,5};
        FunTwiceAvlabelOrNotain(arr);
       
    }
}
