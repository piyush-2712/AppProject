import java.util.Collections;
import java.util.Comparator;

//class SortByType<T> implements Comparator {
//
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        return o1.com;
//    }
//}


public class TestClass {
//    boolean validate

    public static void main(String[] args) {

//        Node root= new Node(5);
//        root.left=new Node(2);
//        root.right=new Node(11);
//
//        Node left=root.left;
//
//        left.left=new Node(1);

        Node root= new Node(5);
        root.left=new Node(2);
        root.right=new Node(11);

        Node left=root.left;

        left.left=new Node(1);

        TestClass obj = new TestClass();
        System.out.println(obj.validateTree(root));

    }

    Node lastNode;

    public boolean validateTree(Node node){

        if(node==null)
            return true;

        boolean leftBool=validateTree(node.left);

        if(lastNode!=null && node.data.compareTo(lastNode.data)<0){
            return false;
        }

        lastNode=node;
        boolean rightBool=validateTree(node.right);

        return leftBool && rightBool;

    }

}





class Node<T extends Comparable>{
    T data;
    Node left,right;

    public Node(T data){
        this.data=data;
    }

}



