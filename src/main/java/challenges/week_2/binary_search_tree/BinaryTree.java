package challenges.week_2.binary_search_tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTree implements IBinaryTree {
        private final Node rootNode;
        private int count = 1;
        private List<Integer> intList;

        public BinaryTree(final int element) {
            rootNode = new Node(element);
        }

        @Override
        public int getRootElement() {
            return rootNode.getValue();
        }

        @Override
        public int getNumberOfElements() {
            return getCount();
        }

        @Override
        public void addElement(final int element) {
            addNodeToTree(rootNode, element);
        }

        @Override
        public void addElements(int[] elements) {
            for (int element : elements) {
                addNodeToTree(rootNode, element);
            }
        }

        @Override
        public boolean findElement(final int value){
            Node node = findNode(value);
            return node != null;
        }

        @Override
        public int[] getSortedTreeAsc() {
            intList = new ArrayList<>();
            //recursive method call
            recursiveCall(rootNode);
            //easy sort to ascending order
            Collections.sort(intList);
            //returns the convert to int array method
            return convertToIntArray(intList);
        }

        @Override
        public int[] getSortedTreeDesc() {
            intList = new ArrayList<>();
            //recursive method call
            recursiveCall(rootNode);
            //easy sort to descending order
            intList.sort(Collections.reverseOrder());
            //returns the convert to int array method
            return convertToIntArray(intList);
        }

        //method for converting into int array from List
        private int[] convertToIntArray(List<Integer> intList){
            int itr = 0;
            int[] sortedArray = new int[intList.size()];
            //convert into int array from list
            for (Integer value: intList) {
                sortedArray[itr] = value;
                itr++;
            }
            return sortedArray;
        }

        //go through this method once again - convoluted understanding
        private void recursiveCall(Node currentNode){
            //traverse through the right child nodes until the end
            if (!currentNode.isRightChildEmpty()){
                recursiveCall(currentNode.getRightChild());
            }
            //add to List here as the code should go through here all the time.
            intList.add(currentNode.getValue());
            //traverse through the left child nodes until the end
            if (!currentNode.isLeftChildEmpty()){
                recursiveCall(currentNode.getLeftChild());
            }
        }

        //getter method
        private int getCount() {
            return count;
        }

        private Node findNode(int element){
            Node node = rootNode;
            while(node != null){
                if (element == node.getValue()){
                    return node;
                }
                if (element < node.getValue()) {
                    node = node.getLeftChild();
                } else {
                    node = node.getRightChild();
                }
            }
            return null;
        }

        private void addNodeToTree(Node node, int element){
            if (element <= node.getValue()) {
                if(node.isLeftChildEmpty()){
                    node.setLeftChild(new Node(element));
                    count++;
                } else {
                    addNodeToTree(node.getLeftChild(), element);
                }
            } else if (element > node.getValue()) {
                if (node.isRightChildEmpty()){
                    node.setRightChild(new Node(element));
                    count++;
                } else {
                    addNodeToTree(node.getRightChild(), element);
                }
            }
        }
}

