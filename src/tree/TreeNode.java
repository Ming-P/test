package tree;

/**
 * @description:
 * @author: Ming
 * @time: 2020/7/27 20:44
 */

public class TreeNode {
    TreeNode left;
    int val;
    TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

