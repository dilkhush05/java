 public class JumpStairs {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        if(n == 1  ) return 0;

        int prev1 = 0;
        int prev2 = Math.abs(heights[1] - heights[0]);

        if(n == 2) return prev2;

        for(int i = 2; i< n ; i++){
            int curr1 =prev2 + Math.abs(heights[i] - heights[i-1]);
            System.out.println("the curr1 is :" + i + " :"+ curr1);
            int curr2 = prev1 + Math.abs(heights[i] - heights[i-2]);
            System.out.println("the curr2 is :" +  i + " :"+ curr2);

            
            
            int curr = Math.min(curr1 ,curr2);
        System.out.println("the curr is :" +  i + " :"+ curr);

                    System.out.println("the prev2 is :" + i + " :"+ prev2);
            

            prev1 = prev2;
            System.out.println("the prev1 is :" +  i + " :"+ prev1);
            prev2   = curr; 
            System.out.println("the prev2 is :" +  i + " :"+ prev2);

        }
        return prev2;
        
    }
    public static void main(String[] args) {
        int n = 8;
        int arr[] = {7 ,4, 4, 2 ,6 ,6, 3 ,4 };
        System.out.println(frogJump(n, arr));
    }

} 
