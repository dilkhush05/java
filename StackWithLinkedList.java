

public class StackWithLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        public void push(int n) {
            Node newNode = new Node(n);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int peek() {
            if (head == null)
                return -1;
            return head.data;
        }

        public int pop() {
            if (head == null)
                return -1;
            int top = head.data;
            head = head.next;
            return top;

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
