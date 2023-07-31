import java.util.Scanner;
class node{
    int data ;
    node left ;
    node right ;
    //constructor
    node(int d){
        this.data= d ;
        this.left = null;
        this .right = null;
    }
}

public class Build_BST {
public static node buildTree(node root){
   Scanner sc = new Scanner(System.in);
   int d = sc.nextInt();
   if(d==-1){
       return null;
   }
    // we cant use noot.data = d;  we hate to use that constructor
   root =new node(d);
   System.out.println("Enter the data you want to print the left of "+ d );
   root.left = buildTree(root.left);
    System.out.println("Enter the data you want to print the right of "+ d );
    root.right = buildTree(root.right);

    return root;
}

    public static void main(String[] args) {
        node root = null ;
        root = buildTree(root);
    }
}

// 1 3 5 7 11 17 -1 -1 -1 -1 -1 -1 -1