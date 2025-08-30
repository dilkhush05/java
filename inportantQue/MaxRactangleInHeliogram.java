
import java.util.*;
public class MaxRactangleInHeliogram {

    public static int MaxRactangleInHeliograme(int arr[]){
        int n = arr.length;
        int nsr[] = new int[n];
        int nsl[] = new int[n];

        //next smaller right
        Stack<Integer> sr = new Stack<>();
        for(int i = n-1 ; i >= 0 ;i--){
            while (!sr.isEmpty() && arr[sr.peek()] >= arr[i]) {
                sr.pop();
            }

            if(sr.isEmpty()){
                nsr[i] = n;
            }else{
                nsr[i] = sr.peek();
            }

            sr.push(i);
        }

         //next smaller Left
        Stack<Integer> sl = new Stack<>();
        for(int i = 0 ; i < n ;i++){
            while (!sl.isEmpty() && arr[sl.peek()] >= arr[i]) {
                sl.pop();
            }

            if(sl.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = sl.peek();
            }

            sl.push(i);
        }


        //  max Area Rectangle
        int maxArea = 0;
        for(int i =0 ; i< n ;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int curr = height * width;
                maxArea = Math.max(maxArea , curr);
        }

        return maxArea;


    }


    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.println(MaxRactangleInHeliograme(arr));
    }
}
