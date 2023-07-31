import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node3{
    int data ;
    node3 left ;
    node3 right ;


    node3(int d ){
        this.data = d ;
        this.left = null ;
        this.right = null ;
    }
}
public class LevelOrderTreeBuild {

    public static node3 buildLevelOrder(node3 root ){
        Scanner sc = new Scanner(System.in);
        Queue<node3> q = new LinkedList<>();
        int d = sc.nextInt();
        root = new node3(d);
        q.add(root);

        while(!q.isEmpty()){
            node3 temp = q.peek();
            q.remove();
            System.out.println("Enter left node for "+temp.data);
            int l = sc.nextInt();
            if(l!=-1){
                temp.left = new node3(l);
                q.add(temp.left);
            }
            System.out.println("Enter right node for "+temp.data);
            int r = sc.nextInt();
            if(r!=-1){
                 temp.right = new node3(r);
                q.add(temp.right);
            }
        }
    return root;
    }

    public static void printTree(node3 root){
        if(root==null )return ;

        printTree(root.left);
        System.out.print(" " + root.data );
        printTree(root.right);

    }

    public static void main(String[] args) {
    node3 root =  null ;
   root =  buildLevelOrder(root);
   //System.out.println("  " +root.left.data + "  " +root.data + "  " +root.right.data );
    printTree(root);
    }
//1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
    //1
    //3 5
    //7 11 17 -1
    //-1 -1 -1 -1 -1 -1
}
