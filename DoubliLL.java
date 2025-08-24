public class DoubliLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ADD FIRST
    public void AddFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;   
        }
        size++;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next ;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // PRINT LIST
    public void print(){
        Node temp = head;     
        while(temp != null ){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        DoubliLL dll = new DoubliLL();

        dll.AddFirst(5);
        dll.AddFirst(50);
        dll.AddFirst(10);
        dll.AddFirst(23);

        dll.print();  
        // Output: 23->10->50->5->null
        dll.reverse();
        dll.print();
    }
}
