import java.util.Stack;

public class ReverseStack {
    public static void push_at_bottom(int data, Stack<Integer> s) {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        push_at_bottom(data, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
    if (s.empty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        push_at_bottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
