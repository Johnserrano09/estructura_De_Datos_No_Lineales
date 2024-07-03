package main;
import main.Materia.Controllers.AVLTree;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.Graph;
import main.Materia.Controllers.Sets;
import main.Materia.Modeles.Node;
import main.Materia.Modeles.NodeGraph;
/*
 * 
 * 
 */
public class App {
    public static void main(String[] args) throws Exception {


        ArbolBinario arbolBinario = new ArbolBinario();
        Node nodeRoot = new Node(1);
        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRigth(new Node(3));

        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRigth(new Node(5));

        nodeRoot.getRigth().setRigth(new Node(6));

        nodeRoot.getLeft().getLeft().setLeft(new Node(7));
        nodeRoot.getRigth().getRigth().setRigth(new Node(8));;

        arbolBinario.PreOrderLoop(nodeRoot);
        System.out.println("\nPREORDER------------------------");
        arbolBinario.PreOrderRecurisvo(nodeRoot);

        System.out.println("\n POSTORDER-----------------------");
        arbolBinario.postOrderLoop(nodeRoot);

        System.out.println("\n POSORDER------------------------");
        arbolBinario.posOrderRecurisvo(nodeRoot);

        System.out.println("\n INORDER-------------------------");
        arbolBinario.inOrderRecursivo(nodeRoot);

        AVLTree tree = new AVLTree();

        int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };

        for (int value : values) {
            tree.insert(value);
        }

        runGraph();
        runSets();

    }

    private static void runSets(){
        new Sets();
    }

    private static void runGraph(){
        Graph graph = new Graph();
        //Agregar nodos
        //NodeGraph node1 = new NodeGraph(1);
        //NodeGraph node2 = new NodeGraph(2);
        //NodeGraph node3 = new NodeGraph(3);
        //NodeGraph node4 = new NodeGraph(4);
        //NodeGraph node5 = new NodeGraph(5);

        NodeGraph node1 = graph.addNode(1);
        NodeGraph node2 = graph.addNode(2);
        NodeGraph node3 = graph.addNode(3);
        NodeGraph node4 = graph.addNode(4);
        NodeGraph node5 = graph.addNode(5);

        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node2, node4);
        graph.addEdge(node4, node5);

        //Imprime el grafo
        graph.printGraph();

        graph.getDFS(node5);

        graph.getBFS(node3);

        graph.printAdjacencyMatrix();


        
    }
}

