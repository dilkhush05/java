import java.util.ArrayList;
public class StackWithArrayList {
   static class Stack{
      ArrayList<Integer> list = new ArrayList<>();
      public boolean isEmpty(){
        return list.size() ==0;
      }

      public void push(int n){
        list.add(n);
      }

      public int peek(){
        return list.get(list.size() -1);
      }
      public void pop(){
        list.remove(list.size() -1 );
      }
   }

   public static void main(String[] args) {
       Stack s = new Stack();
       s.push(6);
       s.push(5);
       s.push(4);
       s.push(3);
       s.push(2);

       while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
       }
   }
}
