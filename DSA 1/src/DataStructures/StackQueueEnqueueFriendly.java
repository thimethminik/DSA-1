/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import java.util.Stack;
public class StackQueueEnqueueFriendly {
     Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}
