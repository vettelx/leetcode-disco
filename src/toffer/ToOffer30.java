package toffer;

import java.util.Stack;

/**
 * ToOffer30
 * 最小栈
 *
 * @author qiang.xu
 * @since 30/12/2021
 */
public class ToOffer30 {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
    }

    static class MinStack {

        private final Stack<Integer> stack1;
        private final Stack<Integer> stack2;

        public MinStack() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            if (stack2.isEmpty()) {
                stack2.push(x);
            } else if (x <=stack2.peek()) {  // 注意是 <=
                stack2.push(x);
            }
            stack1.push(x);
        }

        public void pop() {
            int pop = stack1.pop();
            if (!stack2.isEmpty() && pop == stack2.peek()) {
                stack2.pop();
            }
        }

        public int top() {
            return stack1.isEmpty() ? -1 : stack1.peek();
        }

        public int min() {
            return stack2.isEmpty() ? -1 : stack2.peek();
        }
    }
}
