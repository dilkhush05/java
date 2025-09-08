import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueImpQuestion {

    public static void printNonRepeting(String str){
        int freq[] = new int [26];
        Queue<Character> q = new LinkedList<Character>();

        for(int i =0 ;i< str.length() ;i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1 +" ");
            }else{
                System.out.print(q.peek() + " ");
            }

        }
        System.out.println();
    }


    //InterLeave Queue  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void InterLeave(Queue<Integer> q){
        Queue<Integer> temp = new LinkedList<>();

        int size = q.size();
        for(int i =0;i< size /2; i++){
            temp.add(q.remove());

        }

        while(!temp.isEmpty()){
            q.add(temp.remove());
            q.add(q.remove());
        }
    }

    // reverse the Queue __________________________
    public static void reverseQ(Queue<Integer> q ){
        Stack<Integer> s= new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        
        // String str = "aabccxb";
        // printNonRepeting(str);

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        // InterLeave(q);

        reverseQ(q);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        
        
    }
}
