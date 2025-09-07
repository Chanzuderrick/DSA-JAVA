public class App {
    public static void main(String[] args) throws Exception {

        /*
         * BINARY TREES
         * They have a maximum of 2 children on each parent node
         * Even if it has one child, its ok. No more than 2
         * 
         * BINARY SEARCH TREE
         * A bit different from the binary tree
         * the root node should be greater than the left child and less than the right child
         * they are arranged this way for easier look up
         * runtime complexity is O(LOG N)
        */
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(4));
        tree.insert(new Node(3));
        tree.insert(new Node(2));
        tree.insert(new Node(6));
        tree.insert(new Node(8));
        tree.insert(new Node(7));



        tree.remove(1);

        tree.display();
        System.out.println(tree.search(8));
        

    }
}
