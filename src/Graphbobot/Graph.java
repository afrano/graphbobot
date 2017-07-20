package Graphbobot;

import java.util.ArrayList;


/**
 *
 * @author Amran
 */
class Graph {

    Vertex[] vertexList;

    int[][] adjacencyMatrix;
    int maxVertex = 10;
    int countVertex = 0;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        for (int i = 0; i < vertexList.length; i++) {
            for (int j = 0; j < vertexList.length; j++) {
                if (i == j) {
                    adjacencyMatrix[i][j] = 0;
                } else {
                    adjacencyMatrix[i][j] = -1;
                }
            }
        }
    }

    public void addVertex(char vertex) {
        vertexList[countVertex] = new Vertex(vertex);
        countVertex++;
    }

    public void addEdge(char x, char y, int bobot) {
        adjacencyMatrix[indexVertex(x)][indexVertex(y)] = bobot;
        adjacencyMatrix[indexVertex(y)][indexVertex(x)] = bobot;
    }

    public void show() {
        for (int i = 0; i < countVertex; i++) {
            System.out.println("Vertek : " + vertexList[i].label);
        }

        System.out.println("");

        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                if (adjacencyMatrix[i][j] == -1) {
                    System.out.println("Node " + vertexList[i].label
                            + " tidak terhubung dengan node " + vertexList[j].label);
                } else {
                    System.out.println("Node " + vertexList[i].label
                            + " terhubung dengan node " + vertexList[j].label
                            + " dengan bobot " + adjacencyMatrix[i][j] + " ");
                }
            }
            System.out.println("");
        }

    }

    private int indexVertex(char label) {
        for (int i = 0; i < vertexList.length; i++) {
            if (vertexList[i].label == label) {
                return i;
            }
        }
        return -1;
    }

    public void dfs() {
        Stack st = new Stack();
        int bantu;
        st.push(0);
        while (!st.isEmpty()) {
            bantu = st.pop();
            if (vertexList[bantu].flagVisited == false) {
                System.out.print(vertexList[bantu].label + " -> ");
                vertexList[bantu].flagVisited = true;
            }
            for (int i = countVertex - 1; i > 0; i--) {
                if (adjacencyMatrix[bantu][i] >= 1 && vertexList[i].flagVisited == false) {
                    st.push(i);
                }
            }
        }
    }

    public int jumlahEdge() {
        int count = 0;
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                if (adjacencyMatrix[i][j] == -1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void cari(char node) {
        Stack st = new Stack();
        int bantu;
        st.push(0);
        while (!st.isEmpty()) {
            bantu = st.pop();
            if (vertexList[bantu].flagVisited == true) {

                vertexList[bantu].flagVisited = false;
            }

            if (vertexList[bantu].label == node) {
                System.out.println("Cari node " + node + " : \n-------------------------\ndata node " + node + " ditemukan ");
            } else {
                System.out.println("cari node " + node + " : data tidak ditemukan");
            }

            for (int i = countVertex - 1; i > 0; i--) {
                if (adjacencyMatrix[bantu][i] >= 1 && vertexList[i].flagVisited == false) {
                    st.push(i);
                }
            }
        }
    }

    public void tetangga() {
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                if (adjacencyMatrix[i][j] >= 1) {
                    System.out.println(" " + vertexList[i].label + " Node Tetangga  " + vertexList[j].label);
                }
            }
            System.out.println("---------------------------");
        }
    }

    public Vertex[] inwardEdges(char node) {
        int nodeIndex = indexVertex(node);
        ArrayList<Vertex> list = new ArrayList<>(vertexList.length);
        if (nodeIndex != -1) {
            for (int i = 0; i < adjacencyMatrix[nodeIndex].length; i++) {
                if (adjacencyMatrix[i][nodeIndex] > 0) {
                    list.add(vertexList[i]);
                    System.out.println(" Sisi Masuk "+vertexList[i].label+node);
                }
            }
        }
        return list.toArray(new Vertex[0]);
    }

    public Vertex[] outwardEdges(char node) {
        int nodeIndex = indexVertex(node);
        ArrayList<Vertex> list = new ArrayList<>(vertexList.length);
        if (nodeIndex != -1) {
            for (int i = 0; i < adjacencyMatrix[nodeIndex].length; i++) {
                if (adjacencyMatrix[nodeIndex][i] > 0) {
                    list.add(vertexList[i]);
                    System.out.println("Sisi Keluar "+node+vertexList[i].label);
                }
            }
        }
        return list.toArray(new Vertex[0]);
    }

}
