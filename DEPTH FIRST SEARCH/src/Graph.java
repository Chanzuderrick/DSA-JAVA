import java.util.*;

public class Graph{
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){
        matrix = new int[size][size] ;
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
    public void print(){
        System.out.print("  ");
        for(Node node: nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i= 0; i < matrix.length; i++){
            System.out.println(nodes.get(i).data + " ");

            for(int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void depthSearch(int src){ //we use int src to keep track of nodes we've previously visited
       boolean[] visited = new boolean[matrix.length];
       DFSHelper(src, visited); //helper function




    }

    private void DFSHelper(int src, boolean[] visited){
        if(visited[src] == true){
            return;
        }
        else{
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }

        for(int i= 0; i < matrix[src].length; i++){ //matrix[src].length is equal to length of a row
            if(matrix[src][i] == 1){
                DFSHelper(i, visited);
            }

        }
        return;

    }
}