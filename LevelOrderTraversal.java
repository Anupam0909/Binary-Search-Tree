import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node1{
    int data ;
    node1 right ;
    node1 left ;
    node1(int d ){
        this.data = d ;
        this.left = null;
        this.right = null;
    }
}
public class LevelOrderTraversal {
public static node1 buildTree(node1 root){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    if(d==-1)return null;
    root = new node1(d);

    System.out.println("Enter the element you wamt to add at the left of "+d );
    root.left = buildTree(root.left);
    System.out.println("Enter the element you wamt to add at the right of "+d );
    root.right = buildTree(root.right);

    return root ;

}


// level order traversal uses queue .
    // we add a null when one level completes .

public static void levelOrder(node1 root){
    Queue<node1> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){

        node1 temp = q.poll();
        if(temp == null){
        System.out.println();
        if(!q.isEmpty())q.add(null);
        continue;
        }
        System.out.print(temp.data+" ");
        if(temp.left!=null)q.add(temp.left);
        if(temp.right!=null)q.add(temp.right);
    }
}

    public static void main(String[] args) {
    node1 root = null;
    root = buildTree(root);
    levelOrder(root);
    // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
    }

}
