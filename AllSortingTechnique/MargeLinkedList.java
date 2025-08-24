public class MargeLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public void addfirst(int data) {
        Node neNode = new Node(data);
        if (head == null) {
            head = neNode;
            return;
        }
        neNode.next = head;
        head = neNode;
    }

    public Node findmid(Node head) {
        Node slow = head;
        Node fast = head != null ? head.next : null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node margeSort(Node head) {
        // base Case
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = findmid(head);

        // using Recursion
        Node LeftHead = mid.next;
        mid.next = null;

        Node LeftLL = margeSort(head);
        Node RightLL = margeSort(LeftHead);

        return marge(LeftLL, RightLL);
    }

    public Node marge(Node LeftLL, Node RightLL) {
        Node MargedLL = new Node(-1);
        Node temp = MargedLL;

        while (LeftLL != null && RightLL != null) {
            if (LeftLL.data >= RightLL.data) {
                temp.next = RightLL;
                RightLL = RightLL.next;
                temp = temp.next;
            } else {
                temp.next = LeftLL;
                LeftLL = LeftLL.next;
                temp = temp.next;
            }
        }
        while (LeftLL != null) {
            temp.next = LeftLL;
            LeftLL = LeftLL.next;
            temp = temp.next;
        }
        while (RightLL != null) {
            temp.next = RightLL;
            RightLL = RightLL.next;
            temp = temp.next;
        }
        return MargedLL.next;
    }

    //__________________ZIG ZAG Linked List____________________
    public Node ZigZag(Node head){
        //Find mid 
        Node Mid = findmid(head);

        //divaide to type
        Node RightSide = Mid.next;
        Mid.next = null;

        Node firstHalf = head ;
        Node SecondHalf = RightSide ;

        Node nextLNode;
        Node nextRNode;
        while(firstHalf != null && SecondHalf != null){
            nextLNode = firstHalf.next;
            firstHalf.next = SecondHalf;
            nextRNode = SecondHalf.next;
            SecondHalf.next = nextLNode;

            firstHalf = nextLNode;
            SecondHalf = nextRNode;
        }

        return head;
        
        
    }













    //__________________ZIG ZAG Linked List____________________

    public void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MargeLinkedList ll = new MargeLinkedList();
        ll.addfirst(55);
        ll.addfirst(10);
        ll.addfirst(9);
        ll.addfirst(57);
        ll.addfirst(3);
        // ll.addfirst(30);

        ll.printll();

        // Print the data of the middle node
        System.out.println("Middle Node: " + ll.findmid(ll.head).data);
        
        ll.head = ll.margeSort(ll.head);
        System.out.println("Middle Node: " + ll.findmid(ll.head).data);
        ll.printll();
        ll.head = ll.ZigZag(ll.head);
        ll.printll();


    }
}
