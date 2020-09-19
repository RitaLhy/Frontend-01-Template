class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        helper(root,res);
        return res;
    }
    private void helper(TreeNode treeNode,List<Integer> rList){
        if(treeNode==null){
            return;
        }
        if(treeNode.left!=null){
            helper(treeNode.left,rList);
        }
        rList.add(treeNode.val);
        if(treeNode.right!=null){
            helper(treeNode.right,rList);
        }
    }
}
