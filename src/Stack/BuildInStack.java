package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BuildInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        System.out.println(stack.push(20));

        Deque<Integer> d = new ArrayDeque<>();
    }
}
