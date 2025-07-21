// package inportantQue;

public class TrappedRainWater {
    public static void trapperWater(int arr[]){
        int n = arr.length;
        //left most wall height
        int  leftwall[] = new int[n];
        leftwall[0] = arr[0];
        for(int i = 1; i< n; i++){
            leftwall[i] = Math.max(arr[i], leftwall[i-1]);
        }


        // Right most Wall height 
        int RightWall[] = new int[n];
        RightWall[n-1] = arr[n-1];
        for(int i  = n-2; i >= 0; i--){
            RightWall[i] = Math.max(arr[i], RightWall[i+1]);
        }
        
        //find trapped water 
        int trappeWater = 0 ;
        for(int i = 0; i<n; i++){
            int Waterlavel = Math.min(leftwall[i] ,RightWall[i]);
            trappeWater += Waterlavel - arr[i]; 
        }
        System.out.println("The trapped Water in This Que : " + trappeWater);

    }
    public static void main(StringClass args []){
        int arr[] = { 4,3,2,6,3,1,5};
        trapperWater(arr);
    }
    
}
