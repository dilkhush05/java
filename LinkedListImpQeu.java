
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

    public static void main(String[] args) {
        LinkedListImpQeu LL = new LinkedListImpQeu();
        LL.AddFirst(1);
        LL.AddFirst(2);
        LL.AddFirst(3);
        LL.AddFirst(4);
        LL.AddFirst(5);
        
        LL.Print();
        LL.ReverseLL();
        LL.Print();
    }
}
