package toffer;

import java.util.Stack;

/**
 * ToOffer09
 * 两个栈实现队列
 *
 * @author qiang.xu
 * @since 30/12/2021
 */
public class ToOffer09 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    class CQueue {

        private final Stack<Integer> stack1;
        private final Stack<Integer> stack2;

        public CQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        /**
         * 入队
         *
         * @param value
         */
        public void appendTail(int value) {
            stack1.push(value);
        }

        /**
         * 出队
         *
         * @return 对头元素
         */
        public int deleteHead() {
            if (!stack2.isEmpty()) {
                return stack2.pop();
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            if (stack2.isEmpty()) {
                return -1;
            } else {
                return stack2.pop();
            }
        }
    }
}
