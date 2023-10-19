import java.util.ArrayList;

class StackUsingArrayList{
static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
            return list.size() == 0;
    }
    public void push(int data){
        list.add(data);
    }
    public int pop(){
        if (isEmpty()){
            return -1;
        }
        int top= list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public int peek(){
                if (isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    public static void main(String[] args) {
        StackUsingArrayList stack = new StackUsingArrayList();
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}