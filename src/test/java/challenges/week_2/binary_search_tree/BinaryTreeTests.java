package challenges.week_2.binary_search_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTests {
    BinaryTree binaryTree = new BinaryTree(13);

    @Test
    public void binaryTreeTest() {
        //retrieve the root node value
        assertEquals(13, binaryTree.getRootElement());

        //test single element has been added to the tree and can be found
        binaryTree.addElement(31);
        assertTrue(binaryTree.findElement(31));

        //test int array can be added to the tree and can be found
        binaryTree.addElements(new int[]{6, 2, 19, 98});
        assertTrue(binaryTree.findElement(19));

        //test value not in the tree to check find operation
        assertNotEquals(true, binaryTree.findElement(14));

        //test there how many nodes there are in the tree
        assertEquals(6, binaryTree.getNumberOfElements());

        //test the ascending sorted array with binary tree
        assertArrayEquals(new int[]{2, 6, 13, 19, 31, 98}, binaryTree.getSortedTreeAsc());

        //test the descending sorted array with binary tree
        assertArrayEquals(new int[]{98, 31, 19, 13, 6, 2}, binaryTree.getSortedTreeDesc());
    }
}