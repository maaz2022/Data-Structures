import java.util.LinkedList;

public class MergedLinkedListUsingCF {
    public static LinkedList<Integer> mergeLinkedList(LinkedList<Integer> list1,LinkedList<Integer> list2){
    LinkedList<Integer> mergedList = new LinkedList<Integer>();
    while(!list1.isEmpty() && !list2.isEmpty()){
        if(list1.getFirst() < list2.getFirst()){
            mergedList.addLast(list1.removeFirst());
        }
        else{
            mergedList.addLast(list2.removeFirst());
        }
    }
     mergedList.addAll(list1);
     mergedList.addAll(list2);
    return mergedList;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list1= new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        LinkedList<Integer> mergedList = mergeLinkedList(list1, list2);
        System.out.println(mergedList);
    }
}
