package main.Ejercicio_02_invert;

import main.Materia.Modeles.Node;

public class InvertBinaryTree {

    public Node invertTree(Node root) {
      // Si el nodo raíz es null, no hay nada que invertir, por lo tanto, retornamos null.
      if (root == null) {
        return null;
    }

    // Llamamos recursivamente izquierdo.
    Node left = invertTree(root.getLeft());

    // Llamamos recursivamente derecho.
    Node right = invertTree(root.getRigth());

    // Intercambiamos  izquierdo y derecho.
    root.setLeft(right);
    root.setRigth(left);

    // Retornamos la raíz del árbol invertido.
    return root;
    }

}
