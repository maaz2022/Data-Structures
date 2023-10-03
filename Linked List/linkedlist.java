public class linkedlist {
    Node head;
    private int size;

    linkedlist(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next=null;
            size++;
        }
        
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void displayList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is already empty..!");
            return;
        }
        size--;
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty..!");
            return;
        }
                size--;

        if(head.next==null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }
    public void reverseList(){
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next =prevNode;

            // update
            prevNode =currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public Node findMiddle(Node head){
        Node hare=head;
        Node turtle = head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public Node reverse(Node head){
        Node prevNode = null;
        Node currNode = head;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode =nextNode;
        }
        return prevNode;
    }
    public boolean isPalindrome(Node head){
        if(head==null || head.next== null){
            return true;
        }

        Node middle= findMiddle(head);
        Node secondHalfStart=reverse(middle.next);
        Node firstHalfStart=head;
        while(secondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data ){
                return false;
            }
            firstHalfStart=firstHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }
    public Node reverseRecersive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newhead=reverseRecersive(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public Node deletNode(Node head,int n){
        if(head.next == null){
            return null;
        }
        if(n==size){
            return head.next;
        }
        int indexToSearch= size-n;
        Node prevNode = head;
        int i=1;
        while(i<indexToSearch){
            prevNode =prevNode.next;
            i++;
        }
        prevNode.next =prevNode.next.next;
        return head;
    }
    public static void main(String[] args) {
        linkedlist list= new linkedlist();
        list.addFirst("1");
        list.addFirst("1");
        list.addLast("1");
        // list.displayList();
        // list.addFirst("this");
        // list.deleteLast();
        // list.addLast("Linked List");
        list.displayList();
        // list.reverseList();
        // list.deletNode(list.head, 0);
        boolean p=list.isPalindrome(list.head);
        System.out.println(p);
        // list.head =list.reverseRecersive(list.head);
        // list.displayList();
        // list.deleteLast();
        // System.out.println(list.getSize());
    }
}
