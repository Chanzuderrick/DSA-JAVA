import java.util.*;

public class Graph{
    int[][] matrix;
    ArrayList<Node> nodes;

    Graph(int size){
        matrix = new int[size][size];
        nodes = new ArrayList<>();

    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }else{
            return false;
        }
    }

    public void print() {

        System.out.print("  "); //for formatting purposes

        for (Node node : nodes) { //enhanced for loop, goes through every element in the arrayList, it prints A, B, C

            System.out.print(node.data + " ");

        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " "); //Prints A, B, C vertically

            for (int j = 0; j < matrix[i].length; j++) {

                /*
                 * we use matrix[i] because we want to deal with the columns of a row one by one
                */
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    
    public void breadthSearch(int src) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while(queue.size() != 0){
            src = queue.poll();
            System.out.println(nodes.get(src).data + "= visited");

            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;

                }
                
            }

        }
    }
}