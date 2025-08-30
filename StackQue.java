import java.util.*;
public class StackQue {
    public static void PushElementAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushElementAtBottom(s , data);
        s.push(top);
    }
// =========================================================================
// ____________________ReverseString_____________________________
    public static String ReverseString(String str ){
        int n =  str.length();
        Stack<Character> s = new Stack<>();

        for(int i =0; i< n ;i++){
            char ch = str.charAt(i);
            s.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.peek());
            s.pop();

        }
           
 
        return sb.toString();
    }
    // _______________________ReverseStringUsingSB________________
    public static String ReverseStringUsingSB(String str){
        return new StringBuilder(str).reverse().toString();
    }
// =================================================================================

// ____________________ReverseStack____________________________

    public static void ReverseStack(Stack<Integer> s ){
        ArrayList<Integer> arr  = new ArrayList<>();
        

        while(!s.isEmpty()){
            arr.add(s.pop());
            
        }
        for(int num : arr){
            s.push(num);
        }
    }

// _______________________ReverseStackUsingRecursionBCZnotUsingExtraSpace________________

    public static void ReversStackUsingREc(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        ReversStackUsingREc(s);
        PushElementAtBottom(s , top);

    }

// ==================================================================================

// _________________NextGreaterElement_________________

    public static int[] NextGraterElement(int[] arr){
        int n = arr.length;
        Stack<Integer> temp = new Stack<>();
        int[] ans = new int[n];
        for(int i = n-1 ; i >= 0 ; i--){
            while (!temp.isEmpty()  && arr[i] >= arr[temp.peek()]) {
                temp.pop();
            }

            if(temp.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = arr[temp.peek()];
            }

            temp.push(i);
        }
        return ans ;
    }

// ===========================================================================================


// __________________________ValidParenthisis_________________________________

    public static boolean ValidParenthisis(String str){
        int n = str.length();
        Stack<Character> s = new Stack<>();

        for(int i =0;i< n ; i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.isEmpty())return false;

                if((ch == ')' && s.peek() == '(')  ||
                    (ch == ']' && s.peek() == '[') || 
                    (ch == '}' && s.peek() == '{')){
                    s.pop();
                    
                }else{
                    return false;
                }
            }

        }

        return s.isEmpty() ;
    }


// =================================================================================================

// _____________________isDuplicatePresent________________________________

    public static boolean isDuplicatePresent(String str){
        int n = str.length();
        Stack<Character> s = new Stack<>();

        for(int i =0; i< n ;i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
            
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // PushElementAtBottom(s , 4);
        
        // ReverseStack(s);
        // printStack(s);

        // ReversStackUsingREc(s);
        // printStack(s);


        

        // String s = "abcd";
        // System.out.print(ReverseString(s));
        // System.out.print(ReverseStringUsingSB(s));

        // int arr[] = {6,8,9,0,6,2};
        // for(int num :NextGraterElement(arr)){
        //     System.out.print(num + " ");
        // }

        // String str = "{([]())}";
        // System.out.print(ValidParenthisis(str));
        String str = "((a+b) + (a+b))";
        System.out.print(isDuplicatePresent(str));



        
        



    }
}
