public class LinkListLoop {
    // Make Node static so it can be used inside static methods
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;

    // Detect cycle using Floyd's Cycle Detection
    public static boolean CycleOrNot(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // move by 1
            fast = fast.next.next;      // move by 2

            if (slow == fast) {         // they meet => cycle
                return true;
            }
        }
        return false;
    }

    //Remove Cycle in LinkdList 

    public static void RemoveCycle(){
        Node slow = head;
        Node fast = head;
        Boolean istrue = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast ){
                istrue = true ;
                break;
            }
        }

        if(istrue == false){
            return;
        }

        slow = head ;
        Node prev = null;

        while(slow != fast ){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

    }

    public static void main(String[] args) {
        // Create nodes manually
         head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;               // connect 1 -> 2
        temp.next = new Node(3);
        temp.next.next = new Node(4);
        temp.next.next.next = new Node(5);

        // Create a loop: last node (5) points back to node 2
        temp.next.next.next.next = temp;  

        // Check cycle
        System.out.println("Has cycle : " + CycleOrNot(head));
        RemoveCycle();
        System.out.println("Has cycle : " + CycleOrNot(head));

        
    }
}
