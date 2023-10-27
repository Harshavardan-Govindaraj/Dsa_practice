class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,targetSum);
    }
    boolean dfs(TreeNode root, int sum)
    {
        if(root==null) return false;
        if(root.val==sum && root.left==null && root.right==null)
        return true;
        return dfs(root.left,sum-root.val) || dfs(root.right,sum-root.val);
    }
}
