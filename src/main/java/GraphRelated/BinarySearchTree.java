package GraphRelated;

/**
 * Created by seradam on 2017.04.27..
 */
public class BinarySearchTree {

    TreeNode root;

    public BinarySearchTree(TreeNode root){
        this.root = root;
    }

    public void add(TreeNode node, int data){
        if (node.data > data){
            if (node.leftChild == null){
                node.leftChild = new TreeNode(data);
            }else{
                add(node.leftChild, data);
            }
        }else{
            if (node.rightChild == null){
                node.rightChild = new TreeNode(data);
            }else{
                add(node.rightChild, data);
            }
        }
    }

    public static void main(String[] args) {
        int[] array= {10,6,15,4,1,35,42,23,8,11};
        TreeNode root = new TreeNode(array[0]);
        BinarySearchTree bst = new BinarySearchTree(root);
        for (int i = 1; i<array.length; i++){
            bst.add(root, array[i]);
        }
        System.out.println(root.leftChild.leftChild.leftChild.data);
    }
}
