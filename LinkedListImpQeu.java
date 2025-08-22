
import java.net.SocketPermission;
import java.util.*;

public class LinkedListImpQeu {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    // Reverse The LinkedList _________________________________
    public void ReverseLL(){
        Node curr = tail = head;
        Node prev = null;
        Node nexNode ;

        while (curr != null) {
            nexNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nexNode;
        }
        head = prev;
    }

    public void Print(){
        if(head == null){
            System.out.println("LinkedList is null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->"); 
            temp = temp.next;
            
        }
        System.out.println("null");

    }


    // _______ReverseNthLLfromLast_______________

    public static void ReverseNthLLfromLast(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(sz == n){
            head = head.next;
            return;
        }

        Node prev = head;
        int szRevNo = sz- n;
        int i =1;
        while(i < szRevNo){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
        
    }

    //____________FindMidOfAnyLL______________________
    public Node FindMidOfAnyLL(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    // _______________CheckPalonDrome_________________

    public Boolean CheckPalonDrome(){
        //normal thinking 
        if(head == null || head.next == null )return true;
        
        Node midNode = FindMidOfAnyLL(head);

        Node prev = null;
        Node curr = midNode;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

        Node left = prev;
        Node right = head;
        while(right != null){
            if(left.data != right.data){
                return false ;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }

    public static void main(String[] args) {
        LinkedListImpQeu LL = new LinkedListImpQeu();
        LL.AddFirst(1);
        LL.AddFirst(2);
        LL.AddFirst(2);
        LL.AddFirst(1);
        // LL.AddFirst(5);
        
        LL.Print();
        // LL.ReverseLL();
        // ReverseNthLLfromLast(2);
        System.out.println(LL.CheckPalonDrome());
        LL.Print();
    }
}
