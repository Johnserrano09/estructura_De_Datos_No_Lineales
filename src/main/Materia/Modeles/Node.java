package main.Materia.Modeles;

public class Node {
    private int value;
    public Node  left;
    private Node rigth;
    private int height;

   

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Node(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRigth() {
        return rigth;
    }
    
    public void setRigth(Node rigth) {
        this.rigth = rigth;
    }

}