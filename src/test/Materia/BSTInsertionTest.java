package test.Materia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import main.Ejercicio_01_insert.InsertBST;
import main.Materia.Modeles.Node;
import org.junit.jupiter.api.Test;

public class BSTInsertionTest {

  @Test
  public void bstInsertionTest() {
    InsertBST bstInsertion = new InsertBST();
    int[] values = { 5, 3, 7, 2, 4, 6, 8 };

    Node root = null;
    for (int value : values) {
      root = bstInsertion.insert(root, value);
    }

    assertEquals(5, root.getValue());
    assertEquals(3, root.getLeft().getValue());
    assertEquals(7, root.getRigth().getValue());
    assertEquals(2, root.getLeft().getLeft().getValue());
    assertEquals(4, root.getLeft().getRigth().getValue());
    assertEquals(6, root.getRigth().getLeft().getValue());
    assertEquals(8, root.getRigth().getRigth().getValue());
  }

  @Test
  public void insertSingleNodeTest() {
    InsertBST bstInsertion = new InsertBST();
    Node root = bstInsertion.insert(null, 10);

    assertEquals(10, root.getValue());
    assertNull(root.getLeft());
    assertNull(root.getRigth());
  }

  @Test
  public void insertMultipleNodesTest() {
    InsertBST bstInsertion = new InsertBST();
    Node root = null;
    root = bstInsertion.insert(root, 10);
    root = bstInsertion.insert(root, 5);
    root = bstInsertion.insert(root, 15);

    assertEquals(10, root.getValue());
    assertEquals(5, root.getLeft().getValue());
    assertEquals(15, root.getRigth().getValue());
  }
}
