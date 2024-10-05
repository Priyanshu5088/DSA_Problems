public class MergeSortOnLL {
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

    // Adding method in linked list
    public void addFirst(int data){
        //Create new node
        Node newNode = new Node(data);
        if(head==null){// when the linked list contains single data
            head = tail = newNode;
            return;
        }
        //assign newNode next to head
        newNode.next = head;
        //make head as newNode
        head = newNode;
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
        
    //Find mid
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //Merge 
    public Node merge(Node h1, Node h2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(h1!=null && h2!=null){
            if(h1.data <= h2.data){
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            }else{
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        } 

        //for remaining nodes
        while(h1!=null){
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while(h2!=null){
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }  

    //For merging
    public Node mergeSort( Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        //Calling for left half and right half
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }


    public static void main(String[] args) {
        MergeSortOnLL ml = new MergeSortOnLL();
        ml.addFirst(1);
        ml.addFirst(2);
        ml.addFirst(3);
        ml.addFirst(4);
        ml.addFirst(5);

        ml.print();
        ml.head = ml.mergeSort(ml.head);
        ml.print();
    }
  
}
