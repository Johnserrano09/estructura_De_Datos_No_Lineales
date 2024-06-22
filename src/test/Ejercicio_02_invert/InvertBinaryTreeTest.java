package test.Ejercicio_02_invert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Materia.Modeles.Node;

import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

    @Test
    public void invertBinaryTreeTest() {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRigth(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRigth(new Node(3));
        root.getRigth().setLeft(new Node(6));
        root.getRigth().setRigth(new Node(9));

        Node newRoot = invertBinaryTree.invertTree(root);
        assertEquals(4, newRoot.getValue());
        assertEquals(7, newRoot.getLeft().getValue());
        assertEquals(2, newRoot.getRigth().getValue());
        assertEquals(9, newRoot.getLeft().getLeft().getValue());
        assertEquals(6, newRoot.getLeft().getRigth().getValue());
        assertEquals(3, newRoot.getRigth().getLeft().getValue());
        assertEquals(1, newRoot.getRigth().getRigth().getValue());
    }
}
