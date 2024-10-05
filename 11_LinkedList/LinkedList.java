public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;;
            this.next = next;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

        // Adding method in linked list
        public void addFirst(int data){
            //Create new node
            Node newNode = new Node(data);
            size++;
            if(head==null){// when the linked list contains single data
                head = tail = newNode;
                return;
            }
            //assign newNode next to head
            newNode.next = head;
            //make head as newNode
            head = newNode;
        }

        public void addLast(int data){
            //Create new node
            Node newNode = new Node(data);
            size++;
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

        //Add elements in the middle of linked list ---->O(n)
        public void addMiddle(int idx , int data){
            if(idx==0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            while(i<idx-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        //Method to remove elements from a linked list
        public int removeFirst(){
            if(size==0){
                System.out.println("Linked List is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }

            int val = head.data;
            head = head.next;
            size--;
            return val;
        }


        public int removeLast(){
            if(size==0){
                System.out.println("Linked List is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }

            Node prev = head;
            for(int i=0; i<size-2; i++){
                prev = prev.next;
            }

            int val = tail.data;// prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }


         //method to search key in a linked list ---->O(n)
         public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data==key){// Key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; // key not found
    }


    //Recursive method to find elements in linked list
    public int helper(Node head , int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    
    //code to REVERSE a LINKED LIST ---> O(n)
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    //code to remove Nth node from the end
    public void removeFromend(int n){
        //Calculate size
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return;
        }

        // Traverse from 1 to sz-1
        int i = 1;
        int toPrev = sz-n;
        Node prev = head;
        while(i < toPrev){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    } 

     //Palindrome Linked List
     //Calculate mid
     public Node findMid(Node head){
        Node Slow = head;
        Node Fast = head;
        while(Fast!=null && Fast.next!=null){
            Slow = Slow.next;//+1
            Fast = Fast.next.next;//+2
        }
        return Slow;
    }

    public boolean palindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //Find mid
        Node mid = findMid(head);
        //Reverse 2nd half array
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //Check if equal
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    public static void main(String[] args) {
       LinkedList ll = new LinkedList(); 
       
       ll.addFirst(2);
       ll.addFirst(1);
       ll.addLast(2);
       ll.addLast(1);
       ll.print();// 1->2->3->4->5
       System.out.println(ll.palindrome());
    }
}
