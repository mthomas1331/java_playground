package challenges.week_2.binary_search_tree;
//Interface - all methods are public and need to be implemented from where it is called
public interface IBinaryTree {

        int getRootElement();

        int getNumberOfElements();

        void addElement(int element);

        void addElements(final int[] elements);

        boolean findElement(int value);

        //int getLeftChild(int element) throws ChildNotFoundException;
        //int getRightChild(int element) throws ChildNotFoundException;

        int[] getSortedTreeAsc();

        int[] getSortedTreeDesc();

}
