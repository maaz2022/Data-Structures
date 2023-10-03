class ListNode{
int value;
ListNode next;

ListNode(int value){
    this.value=value;
    this.next=null;
}
public static void displayList(ListNode head){
    ListNode current = head;
    while(current != null){
        System.out.print(current.value + " -> ");
        current = current.next;
    }
    System.out.println("NULL");
}


public static ListNode mergedLists(ListNode list1,ListNode list2){
     ListNode dummyNode=new ListNode(0);
     ListNode current = dummyNode;

     while(list1 != null && list2 != null){
        if(list1.value < list2.value){
            current.next =list1;
            list1 =list1.next;
        }
        else{
            current.next = list2;
            list2 =list2.next;
        }
        current = current.next;
     }
     if(list1 != null){
        current.next =list1;
     }
     else{
        current.next = list2;
     }
    return dummyNode.next;
     
}
public static void main(String[] args) {

    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(3);
    list1.next.next = new ListNode(5);

    ListNode list2 = new ListNode(2);
    list2.next = new ListNode(4);
    list2.next.next = new ListNode(6);

    ListNode mergedList =mergedLists(list1, list2);
    ListNode.displayList(mergedList);

}

}