import java.util.* ; 

public class InOrder{
  public static void main(String[] args) {
    Solution s = new solution();
    s.inorderTraversal()
  }
}



class Solution {

    public void Traverse(TreeNode root, List<Integer> ans){
        if(root.val == null){
          return ; 
        }
        Traverse(root.left, ans);
        list.add(root.val); 
        Traverse(root.right, ans); 


    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>(); 
        Traverse(root, ans); 
        return ans;
    }
}

