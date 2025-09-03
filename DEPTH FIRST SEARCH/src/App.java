public class App {
    public static void main(String[] args) throws Exception {
        /*
        DEPTH FIRST SEARCH
        1. PICK A ROUTE
        2. KEEP GOING UNTIL YOU REACH A DEAD END, OR PREVIOUSLY VISITED NODE
        3. BACKTRACK TO LAST NODE THAT HAS PREVIOUS UNVISITED NEIGHBOURS

        WE WILL USE A GRAPH THAT UTILLISES ADJACENCY MATRIX
        */

        Graph graph = new Graph(5);
        graph.addNode (new Node('A'));
        graph.addNode (new Node('B'));
        graph.addNode (new Node('C'));
        graph.addNode( new Node('D'));
        graph.addNode( new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

       // graph.print();
        //System.out.println(checkEdge(0,1));
        //graph.depthSearch(0);
       // graph.depthSearch(1);
       // graph.depthSearch(2);
        //graph.depthSearch(3);
        graph.depthSearch(4);


    }
}
