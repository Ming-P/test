package deque;

import java.util.ArrayDeque;

/**
 * @description:
 * @author: Ming
 * @time: 2020/7/27 16:18
 */

public class DequeTest {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addFirst(4);
        deque.addFirst(3);
        deque.addLast(6);
        deque.add(7);
        deque.addFirst(8);
        //deque.removeFirst();
        //deque.removeLast();
        //System.out.println(deque.getLast());
        for (int i:deque) {
            System.out.println(i);
        }
    }
}
