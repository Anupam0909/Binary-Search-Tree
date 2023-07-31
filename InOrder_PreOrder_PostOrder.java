// Inorder = left node right
// preorder = node left right
// postorder =left right node


import java.util.Scanner;

class node2{
    int data ;
    node2 left ;
    node2 right ;

    node2(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }
}
public class InOrder_PreOrder_PostOrder {

    public static void Inorder(node2 root){
      if(root == null)return ;
      Inorder(root.left);
      System.out.print(" "+root.data);
      Inorder(root.right);
    }

    public static void preorder(node2 root){
        if(root == null )return ;
        System.out.print(" "+root.data);
        preorder(root.left);
        preorder(root.right);

    }
    public static void postorder(node2 root){
        if(root == null )return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(" "+root.data);
    }
    public static node2 buildTree(node2 root ){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        if(d==-1)return null;
        root = new node2(d);
        System.out.println("Enter the element you want to add at the left of "+d );
        root.left = buildTree(root.left);
        System.out.println("Enter the element you want to add at the right of "+d );
        root.right = buildTree(root.right);
        return root;
    }
    public static void main(String[] args) {
    node2 root = null;
    root = buildTree(root);
        //
        //             1
        //      3              5
        //   7      11    17
        // Inorder 7 3 11 1 17 5
        // preorder 1 3 7 11 5 17
        // Postorder 7 11 3 17 5 1
    Inorder(root) ;
    System.out.println();
    preorder(root);
    System.out.println();
    postorder(root);

    }

}
