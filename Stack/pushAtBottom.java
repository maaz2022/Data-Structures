import java.util.*;


public class pushAtBottom {
    public static void push_at_bottom(int data, Stack<Integer> s) {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        push_at_bottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        push_at_bottom(4, s);
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
