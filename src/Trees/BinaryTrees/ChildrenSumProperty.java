package Trees.BinaryTrees;

import com.sun.source.tree.Tree;
import java.util.*;
import java.util.LinkedList;

public class ChildrenSumProperty {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
        public TreeNode(){

        }


    }
    static void printBTree(TreeNode root){
       Queue<TreeNode> q= new LinkedList<>();

       q.offer(root);
       while(!q.isEmpty()){
           int size = q.size();
           for(int i=0;i<size;i++){
               TreeNode node = q.poll();

               System.out.print(node.val+" ");
               if(node.left!=null) q.offer(node.left);
               if(node.right!=null) q.offer(node.right);
           }
           System.out.println();
       }

    }
    static void convertToChildrenSumProperty(TreeNode root){
        if(root == null) return;

        int children_sum_down = 0;
        if(root.left != null) children_sum_down+=root.left.val;
        if(root.right != null) children_sum_down+=root.right.val;

        if(root.val < children_sum_down)
            root.val = children_sum_down;
        else{
            if(root.left != null) root.left.val = root.val;
            if(root.right != null) root.right.val = root.val;
        }

        convertToChildrenSumProperty(root.left);
        convertToChildrenSumProperty(root.right);

        int children_sum_backtrack = 0;
        if(root.left != null) children_sum_backtrack+=root.left.val;
        if(root.right != null) children_sum_backtrack+=root.right.val;

        if(root.left!=null || root.right!=null)root.val = children_sum_backtrack;

        return;
    }
    static TreeNode createBinaryTree(Integer[] data){
       if(data == null || data.length==1) return null;
       int n = data.length;
       TreeNode[] nodes = new TreeNode[n];

       for(int i=1;i<n;i++){
           if(data[i]==null)
               nodes[i] = null;
           else
               nodes[i] = new TreeNode(data[i]);
       }

       for(int i=1;i<n;i++){
           int leftChild = 2*i;
           int rightChild = (2*i)+1;
           if(leftChild < n)
               nodes[i].left = nodes[leftChild];
           if(rightChild<n)
               nodes[i].right = nodes[rightChild];
       }

       return nodes[1];
    }
    public static void main(String[] args) {
        Integer[] data = {-1,10,5,2,1,2,null,null,null};

        TreeNode root = createBinaryTree(data);
        convertToChildrenSumProperty(root);
        printBTree(root);
    }
}
