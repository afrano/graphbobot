package Graphbobot;

/**
 *
 * @author Amran
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');

        graph.addEdge('A', 'B', 6);
        graph.addEdge('A', 'D', 4);
        graph.addEdge('B', 'C', 10);
        graph.addEdge('B', 'D', 7);
        graph.addEdge('B', 'E', 7);
        graph.addEdge('C', 'E', 5);
        graph.addEdge('C', 'F', 6);
        graph.addEdge('D', 'C', 8);
        graph.addEdge('E', 'D', 12);
        graph.addEdge('E', 'F', 7);

        System.out.println("Show graph");
        graph.show();
        System.out.println("Depth first search");
        System.out.println("DFS");
        graph.dfs();
        System.out.println("");
        System.out.println("");
        System.out.println("\nCari Node ");

        char cari = 'A';
        graph.cari(cari);
        System.out.println("");

        System.out.println("Node Tetangga");
        graph.tetangga();
        
        
        
        
                

    }
}
