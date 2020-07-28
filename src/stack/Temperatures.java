package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @description:
 * @author: Ming
 * @time: 2020/7/14 11:44
 */

public class Temperatures {
    public static void main(String[] args) {
        Temperatures t = new Temperatures();
        int input[] = {23, 25, 21, 19, 22, 26, 23};
        int a[] = t.dailyTemperatures(input);
        for (int s:a) {
            System.out.println(s);
        }
    }
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] ans = new int[length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < length; i++) {
            int temperature = T[i];
            while (!stack.isEmpty() && temperature > T[stack.peek()]) {
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return ans;

    }
}
