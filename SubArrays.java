
// import java.util.*;
public class SubArrays {


    //its a batter approach but not perfect O(n^2)
    public static void MaxSumAray2(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        //First we find prefix 
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i< arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i]; 
                            System.out.println("prefix" + prefix[i]);

        }

        for(int i = 0; i<arr.length; i++){
            for(int j =i; j< arr.length ; j++){
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i -1];
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }

                System.out.println("The maximum is: " + maxsum);


    }


    //Its a brutforse solution O(n^3)
    public static void MaxSumAray(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = 0; i< n ; i++ ){
            for(int j =i ; j< n; j++){
                for(int k = i ; k<= j; k++){
                    currSum = currSum + arr[k];
                }
                if(maxSum < currSum ){
                    maxSum = currSum;
                }
                System.out.println(currSum);
                currSum = 0;
            }
            // System.out.println("The max Sum of element "+ arr[i]+ " is : "+ maxSum);
             
        }
        System.out.println("The maximum is: " + maxSum);
    }
    

    public static void SubArray1(int arr[]){
        
        for(int i = 0; i< arr.length; i++){
            
            for(int j= i; j< arr.length; j++){
                System.out.print("[" );
                for(int k =i ; k<= j ; k++){
                    
                    if(k==j){
                       System.out.print(arr[k] ); 
                    }else{
                        System.out.print(arr[k] +",");
                        
                    }
                    
                }
               
                System.out.print("]" + " ");
            }
           
            

            System.out.println();
            
        }
        int n = (arr.length * (arr.length +1))/2;
        System.out.println("The Total number of sum: " + n);
    }


// its a optimise approach ; time com : O(n); space com O(1)
    public static void MaxSumAray2UsingKadans(int arr[]){
        int n = 0;
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0;i< arr.length; i++){
            currsum = currsum + arr[i];
            if(currsum < 0 ){
                currsum = 0;
            }
            if(maxsum < currsum){
                maxsum = currsum;
            }
        }
       System.out.println("The maximum is: " + maxsum); 
    }

    public static void MaxSumAray2UsingKadans1(int arr[]) {
    int currSum = arr[0];
    int maxSum = arr[0];

    for (int i = 1; i < arr.length; i++) {
        currSum = Math.max(arr[i], currSum + arr[i]);
        maxSum = Math.max(maxSum, currSum);
    }

    System.out.println("The maximum subarray sum is: " + maxSum);
}

    public static void main(StringClass args[]){
        int Arr[] = {1,-2,6,-1,4};
        // SubArray1(Arr);
        // MaxSumAray2(Arr);
        // MaxSumAray(Arr);
        MaxSumAray2UsingKadans1(Arr);

    }
}
