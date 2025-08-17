public class LinkedList {
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head ;
        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void Addmid(int index , int data){
        if(index == 0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head ;
        int i =0;
        while (i < index -1) {
            temp = temp.next;
            i++;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int RemoveFirst(){
        if(size == 0){
            System.out.println("LinkedList is Empty");
            return Integer.MAX_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = head.next;
            size = 0;
            return val;
        }
        int val = head.data;
        head  = head.next;
        size -- ;
        return val;
    }

    public int RemoveLast(){
        if(size == 0){
            System.out.println("LinkedList is Empty");
            return Integer.MAX_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i =0; i< size -2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size --;
        return val;
    }

    public int SearchKey(int key){
        Node temp = head;
        int i =0;
        while (temp != null)  {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int healper(Node head , int key){
        if(head.next == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int ind = healper(head.next ,key);
        if(ind == -1){
            return -1;
        }
        return ind+1;
    }
    public int recSearch(int key ){
        return healper( head , key);
    }


    public void ReverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }
    public void print(){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(5);
        // ll.head.next = new Node(45); its a wrong way to define 

        ll.addfirst(5);
        // ll.print();
        ll.addfirst(6);
        ll.addLast(5);
        ll.addLast(99);
        // ll.print();
        ll.addLast(90);
        ll.Addmid(2, 9);
         ll.print();
        // ll.RemoveFirst();
        // ll.print();

        // ll.RemoveLast();
        // ll.print();

        // System.out.println("Key is  : " + ll.SearchKey(3));
        // System.out.println("Key is : " + ll.SearchKey(6));
        // System.out.println("Key is  : " + ll.recSearch(3));
        // System.out.println("Key is : " + ll.recSearch(6));


        ll.ReverseLL();
        ll.print();

        System.out.println("Size of LinkedList is : " + ll.size);
    } 
}
