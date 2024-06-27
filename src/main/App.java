package main;
import main.Materia.Controllers.AVLTree;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Modeles.Node;
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




    }
}
