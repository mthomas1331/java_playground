package challenges.week_2.array_merge;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayMergeTests {

    int[] array1, array2, mergeArray, ascSortedArray, descSortedArray;
    ArrayMerge arrayMergeObj;
    Set<Integer> duplicateRemovalTreeSet;

    //initialise the random elements to be populated
    public void initialiseParameters(){
        Random random = new Random();
        array1 = new int[random.nextInt(10)];
        array2 = new int[random.nextInt(10)];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(5);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(5);
        }
    }

    //merge the two arrays together
    private int[] populateMergeArray() {
        int[] mergeArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergeArray, 0, array1.length);
        System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);
        return mergeArray;
    }

    //sort array in ascending order
    public void sortArrayBeforeOutput(int[] mergeArray){
        ascSortedArray = mergeArray.clone();
        Arrays.sort(ascSortedArray);
    }

    //reversing array order using simple algorithm
    public void reverseArray(int[] mergeArray) {
        descSortedArray = mergeArray.clone();
        int temp;
        //swaps the position of elements in the array from the beginning to the end
        for (int i = 0; i < descSortedArray.length / 2; i++) {
            temp = descSortedArray[i];
            descSortedArray[i] = descSortedArray[descSortedArray.length - (i + 1)];
            descSortedArray[descSortedArray.length - (i + 1)] = temp;
        }
    }

    //returns TreeSet which removes duplicates
    public Set<Integer> convertToSet(int[] unsortedArray){
        Integer[] notDuplicateIntArray = new Integer[unsortedArray.length];
        Arrays.setAll(notDuplicateIntArray, i -> unsortedArray[i]);
        return new TreeSet<>(List.of(notDuplicateIntArray));
    }

    //Test method call
    @Test
    public void mergeArrayTest(){
        initialiseParameters();
        populateMergeArray();
        arrayMergeObj = new ArrayMerge(array1,array2);
        mergeArray = populateMergeArray();
        //Merged two arrays test
        assertArrayEquals(mergeArray, arrayMergeObj.getFinalArray());
        //Ascending sorted array test
        sortArrayBeforeOutput(mergeArray);
        assertArrayEquals(ascSortedArray, arrayMergeObj.getAscSortedArray());
        //Reverse array function
        reverseArray(ascSortedArray);
        //Descending sorted array test
        assertArrayEquals(descSortedArray, arrayMergeObj.getDescSortedArray());
        duplicateRemovalTreeSet = convertToSet(mergeArray);
        //Remove duplicate array
        assertIterableEquals(duplicateRemovalTreeSet, arrayMergeObj.getRemoveDuplicateSet());
    }


}
