public class undirectedGraph1{
    public static void main(String[] args){
        /*
        graph = non-linear aggregation of nodes and edges
        a node contains some piece of data
        an edge is a connection between 2 nodes
        We have two types of graphs
        undirected graphs
        directed graphs
        
        UNDIRECTED GRAPHS
        example. social network like facebook
        nodes(friend) and we could establish friendship between different users using a connection (edge)
        they have sth called adjacency. larry is friends with patrick and sandy so larry has adjacency to
        patrick and sandy
        
        
        DIRECTED GRAPHS
        contain edges that link one node to another, however this are one way connections
        an example could be a street map
        
        
        There are two ways to represent graphs
        adjacency matrix    = build a matrix with 0 and 1. the elements are on the row and columns of the matrix.  
                            = if there is adjacency we use 1 else 0
                            = time complexity is 0(1)
                            = space complexity is 0(v^2) , v is vertice or nodes
                            = quick but uses a lot of space
                            = tends to suit graphs with a lot of edges
        
        adjacency list      = is an array or an arraylist of linkedlists
                            = each element is a separate linked list
                            = if theres an adjacency between one node and another we will add the node to our linkedlist
                            = i.e A -> B ->
                            =     B -> C -> E ->
                            =     D ->
                            = time complexity 0(v)
                            = space complexity 0(v+e)
                            = they use less space
        
        
        */
        System.out.println("Introduction to graphs");
    }
}