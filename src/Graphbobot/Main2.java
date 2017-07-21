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
        graph.addEdge('A', 'D', 1);
        graph.addEdge('D', 'A', 0);
        graph.addEdge('B', 'C', 1);
        graph.addEdge('E', 'B', 0);
        graph.addEdge('C', 'B', 1);
        graph.addEdge('B', 'C', 1);
        graph.addEdge('C', 'D', 1);
        graph.addEdge('D', 'C', 1);
        graph.addEdge('D', 'E', 1);
        graph.addEdge('E', 'D', 0);
        graph.addEdge('E', 'B', 0);

        System.out.println("Input Node A");
        System.out.println("Sisi Masuk ");
        graph.inwardEdges('A');
        System.out.println("");
        System.out.println("Input Node B");
        System.out.println("Sisi Masuk ");
        graph.inwardEdges('B');
        System.out.println("");
        System.out.println("Input Node C");
        System.out.println("Sisi Masuk ");
        graph.inwardEdges('C');
        System.out.println("");
        System.out.println("Input Node D");
        System.out.println("Sisi Masuk ");
        graph.inwardEdges('D');
        System.out.println("");
    }
}
