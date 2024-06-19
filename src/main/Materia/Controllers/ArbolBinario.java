package main.Materia.Controllers;


import java.util.Stack;

import main.Materia.Modeles.Node;

public class ArbolBinario {

    //Recorrido del arbol de tipo PreOrder
    public void PreOrderLoop(Node root){
        if (root == null) {
            return;
            
        }

        Stack<Node> stack = new Stack<>();
        //Agregamos a la pila la raiz para empeazar el recorrido 
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.getValue()+" - ");
            //Agregar los hijos de la derecha
            if (node.getRigth() !=null) {
                stack.push(node.getRigth());
                
            }
            // Agregar los hijos de la izquierda a la pila
            if (node.getLeft() !=null) {
                stack.push(node.getLeft());
                
            }
            
        }


    }

    //metodo preOrder recurrsivo
    public void PreOrderRecurisvo(Node node){
        if (node !=null) {
            System.out.print(node.getValue()+ " - ");
            PreOrderRecurisvo(node.getLeft());
            PreOrderRecurisvo(node.getRigth());
            
        }

    }

    ///////////
    public void postOrderLoop(Node root){
        if (root == null) {
            return;
            
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            stack2.push(node);

            if (node.getLeft() != null) {
                stack1.push(node.getLeft());
                
            }
            if (node.getRigth() != null) {
                stack1.push(node.getRigth());
                
            }
            
        }

        while (!stack2.isEmpty()) {
            Node  node = stack2.pop();
            System.out.print(+node.getValue()+"- ");
            
        }

    }
    ///
    public void posOrderRecurisvo(Node node){
        if (node !=null) {
            posOrderRecurisvo(node.getLeft());
            posOrderRecurisvo(node.getRigth());
            System.out.print(node.getValue()+ " - ");
            
        }

    }
    ///metodo recursivo del in order
    public void inOrderRecursivo(Node node){
        if (node !=null) {
            inOrderRecursivo(node.getLeft());
            System.out.print(node.getValue()+ " - ");
            inOrderRecursivo(node.getRigth());
            
        }

    }

}
