package main.Ejercicio_01_insert;

import main.Materia.Modeles.Node;

public class InsertBST {

    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
            
        }

        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
            
        }else if (value > root.getValue()) {
            root.setRigth(insert( root.getRigth(), value));
            
        }
        return root;
    }

}
