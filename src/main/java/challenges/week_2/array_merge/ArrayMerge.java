package challenges.week_2.array_merge;

import java.util.*;

public class ArrayMerge {

    private final int[] intArr1, intArr2, finalArray, ascSortedArray, descSortedArray;
    private final Set<Integer> removeDuplicateSet;
    public ArrayMerge(int[] intArr1, int[] intArr2) {
        this.intArr1 = intArr1;
        this.intArr2 = intArr2;
        //merge two arrays method call
        finalArray = mergedArray();
        //ascending sort method call
        ascSortedArray = sortArrayAsc(finalArray.clone());
        //descending sort method call
        descSortedArray = sortArrayDesc(finalArray.clone());
        //remove duplicate sort method call
        removeDuplicateSet = removeDuplicateFromArray(finalArray.clone());
    }

    //merge 2 arrays method
    private int[] mergedArray(){
        //Calculate the size of the merged array
        int sizeOfMergeArray = intArr1.length + intArr2.length;
        //create the merge array
        int[] mergeArray = new int[sizeOfMergeArray];

        //System method for copy arrays into one
        System.arraycopy(intArr1, 0, mergeArray, 0, intArr1.length);
        System.arraycopy(intArr2, 0, mergeArray, intArr1.length, intArr2.length);
        return mergeArray;
    }

    //sort the array in ascending order method
    private int[] sortArrayAsc(int[] ascArray){
        int temp;
        for (int i = 0; i < ascArray.length; i++) {
            for (int j = 0; j < ascArray.length; j++) {
                if (ascArray[i] < ascArray[j]) {
                    temp = ascArray[j];
                    ascArray[j] = ascArray[i];
                    ascArray[i] = temp;
                }
            }
        }
        return ascArray;
    }

    //sort the array in descending order method - reverse the inequality sign from above
    //Future improvement - make it DRY
    private int[] sortArrayDesc(int[] descArray){
        int temp;
        for (int i = 0; i < descArray.length; i++) {
            for (int j = 0; j < descArray.length; j++) {
                if (descArray[i] > descArray[j]) {
                    temp = descArray[j];
                    descArray[j] = descArray[i];
                    descArray[i] = temp;
                }
            }
        }
        return descArray;
    }

    //removes duplicate from the array
    private Set<Integer> removeDuplicateFromArray(int[] nonDuplicateArray){
        //convert int into Integer wrapper class to make use of Collections - TreeSet
        Integer[] notDuplicateIntArray = new Integer[nonDuplicateArray.length];
        Arrays.setAll(notDuplicateIntArray, i -> nonDuplicateArray[i]);
        return new TreeSet<>(List.of(notDuplicateIntArray));
    }

    //getter for testing purpose
    public int[] getFinalArray() {
        return finalArray;
    }

    public int[] getAscSortedArray() {
        return ascSortedArray;
    }

    public int[] getDescSortedArray() {
        return descSortedArray;
    }

    public Set<Integer> getRemoveDuplicateSet() {
        return removeDuplicateSet;
    }
}
