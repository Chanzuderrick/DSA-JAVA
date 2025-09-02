public class App {
    public static void main(String[] args) throws Exception {
        /*
        ADJACENCY LIST
        An array/ arraylist of linkedlists
        each linked list has a unique node at the head
        all adjacent neighbours to that node are added to that node's linkedlist
        runtime complexity to check Edge: O(V)
        space complexity: 0(V+E) 
        */

        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
    }
}
