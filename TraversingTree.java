public class TraversingTree{
    public static void main(String[] args){

        //NOTES ARE BASED ON BINARY TREE

        /*
         * We are going to talk about inorder, postorder and pre order
         * we begin at the root of the tree in all of the methods
         * Normally we dont have random access
         * 
         * 
         * we will have a class like this in all methods
         * 
         * public class Node{
         * Node left;
         * Node right;
         * int data;
         * 
         * Node(int data){
         * this.data = data;
         * }
         * }
         * 
         * INORDER TRAVERSAL
         * D,B,E,A,F,C,G
         * 
         * lets begin with an inorder traversal
         * LEFT -> ROOT -> RIGHT
         * 
         * private void traverseTree(Node root){
         * traverseTree(root.left);
         * System.out.print(root.data);
         * traverseTree(root.right);
         * }
         * 
         * we will visit all this nodes in a non-decreasing order
         * 
         * 
         * POST ORDER TRAVERSAL
         * LEFT -> RIGHT -> ROOT
         * D,E,B,F,G,C,A
         * 
         * private void traverseTree(Node root){
         * traverseTree(root.left);
         * traverseTree(root.right);
         * System.out.println(root.data);
         * }
         * 
         * used to delete a tree from leaf to root
         * 
         * PRE ORDER TRAVERSAL
         * Its used to create a copy of a tree
         * 
         * ROOT -> LEFT -> RIGHT
         * 
         * A,B,D,E,C,F,G
         * 
         * private void traverseTree(Node root){
         * System.out.println(root.data);
         * traverseTree(root.left);
         * traverseTree(root.right);
         * }
         * 
        */

        System.out.println("notes about Traversing a tree");

    }
}