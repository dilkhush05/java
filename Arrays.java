import java.util.*;
import java.lang.String;
public class Arrays {
    public static int findname(String name[] , String key){
        for(int i = 0;i<name.length;i++){
            if(key == name[i]){
                return i;
            }
        }
        return -1;
    }
    public static int largestInArray (int arr[] ){
        int lrg = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if( lrg < arr[i]){
                lrg = arr[i];

            }
        }
        return lrg;
    }
    public static int SmallestInArray (int arr[] ){
        int sma = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++){
            if( arr[i] < sma){
                 sma = arr[i];

            }
        }
        return sma;
    }
    public static int linearSearch (int arr[],int key){
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void printArr(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


        static final int MOD = 1000000007;

    public static int[] getProductArrayExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        if (n == 0) return result;

        // Step 1: Compute prefix product
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = (int)(((long)result[i - 1] * arr[i - 1]) % MOD);
        }

        // Step 2: Compute suffix product on the fly and multiply
        long suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = (int)((result[i] * suffix) % MOD);
            suffix = (suffix * arr[i]) % MOD;
        }

        return result;
    }
    public static void main (String args[]){
        //HOW TO CREATE ARRAY
        // int marks[] = new int[50];
        int numbers[] = {1,2,2,3};
        getProductArrayExceptSelf(numbers);
        printArr(numbers);

        // String names[] = {"HariKishor" , "Radhe", "Dilkhush", "Manish", "Rajiv", "hero"};

        Scanner Sc = new Scanner(System.in);
        // System.out.println("Enter your Key : ");
        // String key = Sc.next();

        // int key = Sc.nextInt();

        // int arr[]= {1,45,23,78,6,44,69,64,63,34};

        // arr[0] = Sc.nextInt();
        // arr[1] = Sc.nextInt();
        // arr[2] = 100;

        // System.out.println("The marks of che is :" + arr[0]);
        // System.out.println("The marks of Math is :" + arr[1]);
        // System.out.println("The marks of Phy is :" + arr[2]);
        // int avg = (arr[0] + arr[1] +arr[2])/3;

        // System.out.println("The aVarege of all subject is : " + avg + "%");

        // System.out.println("The length of array is :" + arr.length);

        // int index = linearSearch(arr, key);
        // if(index == -1){
        //     System.out.println("NOT FOUND");
        // }else{
        //     System.out.println("The number " + key + "is on " + index + " ind" );
        // }
        // System.out.println("the largest valu of arr is :"+ largestInArray(arr)  );
        // System.out.println("the Smallest valu of arr is :"+ SmallestInArray(arr)  );
         

        //  int index = findname(names, "hero");
        // if(index == -1){
        //     System.out.println("NOT FOUND");
        // }else{
        //     System.out.println( " Hero is Avalibal on " + index  );
        // }

        Sc.close();
    }
}
