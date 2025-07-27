
import java.util.Arrays;

public class Leetcodecontest {
     public static long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int k = nums.length / 3;
        long sum = 0;

        int index = nums.length - 2;

        for(int  i = 0; i < k ; i++){
            sum += nums[index];
            index -= 2;
        }
        return sum;
        
    }

    public static void main(String[] args) {
        int arr[] = {2,1,3,2,1,3};
        System.out.println(maximumMedianSum(arr));

    }
}
