public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10, null, null);

    root.left = new TreeNode(15);
    root.left.left = new TreeNode(39);
    root.left.right = new TreeNode(21);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(72);
    root.right.left.right = new TreeNode(42);

    System.out.println("*****PreOrder*****");
    preOrder(root);
    System.out.println("*****PostOrder*****");
    postOrder(root);
    
  }
  public static void preOrder(TreeNode current)
  {
    if(current == null)
    {
      return;
    }
    //write current
    System.out.println(current.value);
    //search left
    preOrder(current.left);
    //search right
    preOrder(current.right);

  }
  public static void postOrder(TreeNode current)
  {
    if(current == null)
    {
      return;
    }
    //search left
    postOrder(current.left);
    //search right
    postOrder(current.right);
    //write current
    System.out.println(current.value);

  }

}
