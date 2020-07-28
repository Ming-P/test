package tree;

import java.util.ArrayList;

/**
 * @description:
 * @author: Ming
 * @time: 2020/7/27 20:44
 */

public class TreeTest {

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(6);
        t.left = t1;
        t.right = t2;
        t1.left = t3;
        t1.right = t4;
        t4.right = t5;
        //System.out.println(kthSmallest(t,3));
        ArrayList<Integer> array = inorder(t,new ArrayList<Integer>());
        for (int i:array) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return arr;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
        return arr;
    }

    public static int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
        return nums.get(k - 1);
    }

}
