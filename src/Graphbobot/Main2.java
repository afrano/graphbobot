/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphbobot;

/**
 *
 * @author Amran
 */
public class Main2 {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addEdge('A', 'B', 1);
        graph.addEdge('B', 'A', 1);
        graph.addEdge('B', 'A', 1);
        graph.addEdge('B', 'C', 1);
        graph.addEdge('E', 'B', 1);
        graph.addEdge('C', 'B', 1);
        graph.addEdge('B', 'C', 1);
        graph.addEdge('C', 'D', 1);
        graph.addEdge('D', 'C', 1);
        
        System.out.println("4. Sisi Masuk");
        System.out.println("- Input Node A");
        graph.inwardEdges('A');
        System.out.println("");
        System.out.println("- Input Node C ");
        graph.inwardEdges('C');
        System.out.println("");
        
        System.out.println("5. Sisi Keluar");
        System.out.println("- Input Node A ");
        graph.outwardEdges('A');

    }
}
