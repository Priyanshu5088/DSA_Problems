public class RemoveCycle{
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

        public static void removeCycle(){
            //Detect cycle 
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while(slow == fast){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    cycle = true;
                    break;
                }
            }
            if(cycle == false){
                return;
            }
            
            //find the meeting point for second time
            slow = head;
            Node prev = null;
            while(slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

            //Remove the cycle
            prev.next = null;
        }


        public static void main(String[] args) {
            RemoveCycle rc = new RemoveCycle();
            head = new Node(1);
            Node temp = new Node(2);
            head.next = temp;
            head.next.next = new Node(3);
            head.next.next.next = temp;

            System.out.println(removeCycle());
            rc.removeCycle();
        }
}