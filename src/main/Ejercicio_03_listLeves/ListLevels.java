package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Modeles.Node;

public class ListLevels {

    public List<List<Node>> listLevels(Node root) {
         List<List<Node>> levels = new ArrayList<>();
         // Si el nodo raíz es null la lista es vacia
        if (root == null) {
            return levels;
        }
        
        Queue<Node> queue = new LinkedList<>();
        //comenzamos por la raiz para hacer el recorrido 
        queue.offer(root); 

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> levelNodes = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                levelNodes.add(node);
                
                
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }
                if (node.getRigth() != null) {
                    queue.offer(node.getRigth());
                }
            }
            
            levels.add(levelNodes); 
        }
        
        return levels;
    }

}
