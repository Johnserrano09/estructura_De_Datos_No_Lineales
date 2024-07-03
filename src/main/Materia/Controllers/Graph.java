package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Modeles.NodeGraph;

public class Graph {

    private List<NodeGraph> nodes;

    public Graph(){
        this.nodes = new ArrayList<>();

    }

    // Metodo para anadir un nodo
    public NodeGraph addNode(int value){
        NodeGraph newnNodeGraph = new NodeGraph(value);
        nodes.add(newnNodeGraph);
        return newnNodeGraph;

    }

    //Meodo para anadir una arista
    public void addEdge(NodeGraph src, NodeGraph dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);

    }

    //Metodo par imprimir
    public void printGraph(){
        for(NodeGraph node : nodes){
            System.out.print("Vertex "+ node.getValue()+ ":");
            for(NodeGraph neighbor : node.getNeighbors()){
                System.out.print(" -> "+ neighbor.getValue());
            }
            System.out.println();
        }

    }

       // Método de búsqueda en profundidad (DFS)
    public void getDFS(NodeGraph startNodoGraph) {
        boolean[] visited = new boolean[nodes.size()];
        getDFSUtil(startNodoGraph, visited);
        System.out.println();
    }

    private void getDFSUtil(NodeGraph node, boolean[] visited) {
        int index = nodes.indexOf(node);
        if (index == -1 || visited[index]) {
            return;
        }
        visited[index] = true;
        System.out.print(node.getValue() + " ");
        for (NodeGraph neighbor : node.getNeighbors()) {
            getDFSUtil(neighbor, visited);
        }
    }

    // Método de búsqueda en anchura (BFS)
    public void getBFS(NodeGraph startNodoGraph) {
        boolean[] visited = new boolean[nodes.size()];
        Queue<NodeGraph> queue = new LinkedList<>();
        visited[nodes.indexOf(startNodoGraph)] = true;
        queue.add(startNodoGraph);

        while (!queue.isEmpty()) {
            NodeGraph node = queue.poll();
            System.out.print(node.getValue() + " ");
            for (NodeGraph neighbor : node.getNeighbors()) {
                int index = nodes.indexOf(neighbor);
                if (!visited[index]) {
                    visited[index] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Método para obtener la matriz de adyacencia
    public int[][] getAdjacencyMatrix() {
        int size = nodes.size();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            NodeGraph node = nodes.get(i);
            for (NodeGraph neighbor : node.getNeighbors()) {
                int j = nodes.indexOf(neighbor);
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    // Método para imprimir la matriz de adyacencia
    public void printAdjacencyMatrix() {
        int[][] matrix = getAdjacencyMatrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



}
