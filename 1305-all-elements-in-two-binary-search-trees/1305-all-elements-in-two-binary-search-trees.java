class Solution {
    List<Integer> result = new ArrayList<>();
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        preOrderTraversal(root1);
        preOrderTraversal(root2);
        Collections.sort(result);
        return result;
    }
    
    public void preOrderTraversal(TreeNode root) {
        if(root == null) return;
        result.add(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    
}