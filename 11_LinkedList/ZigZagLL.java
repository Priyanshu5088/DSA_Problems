public class ZigZagLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public static Node head;
    public static Node tail;


    public void addLast(int data){
        //Create new node
        Node newNode = new Node(data);
        if(head==null){// when the linked list contains single data
            head = tail = newNode;
            return;
        }
        //assign tail next to newNode
        tail.next = newNode;
        //make newNode as your tail
        tail = newNode;
    }

    //Method to print linked list
    public void print(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
            System.out.println("null");
    }

    public void zigzag(){
        //To find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //2nd half reverse
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Alternate merge -- Zig-Zag
        Node LH = head;
        Node RH = prev;
        Node nextL , nextR;
        
        while(LH!=null && RH!=null){
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            LH = nextL;
            RH = nextR;
        }
    }


    public static void main(String[] args) {
     ZigZagLL zz = new ZigZagLL();
     zz.addLast(1);
     zz.addLast(2);
     zz.addLast(3);
     zz.addLast(4);
     zz.addLast(5);
     zz.addLast(6);
     
     zz.print();
     zz.zigzag();
     zz.print();

    }       
}
