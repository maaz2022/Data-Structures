import java.util.LinkedList;

public class LinkedListUsingCollections {
    public static void main(String[] args) {
        LinkedList <String> list= new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("list");
        System.out.println(list);
        list.addFirst("this");
    

        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" -> ");

        }
        System.out.println("Null");

    }
}
