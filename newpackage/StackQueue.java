
package newpackage;

import java.util.Stack;
public class StackQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation (costly)
    public void enqueue(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(x);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Dequeue operation (O(1))
    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return stack1.pop();
    }

    public static void main(String[] args) {
        StackQueue q = new StackQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
