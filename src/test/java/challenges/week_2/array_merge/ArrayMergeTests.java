package challenges.week_2.array_merge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMergeTests {

    int[] array1, array2;
    ArrayMerge arrayMerge;

    public void initialiseParameters(){

        Random random = new Random();
        array1 = new int[random.nextInt(10)];
        array2 = new int[random.nextInt(10)];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(10);
        }
    }

    public int[] reverseArray(int[] sortedArray) {
        int temp;
        for (int i = 0; i < sortedArray.length / 2; i++) {
            temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - (i + 1)];
            sortedArray[sortedArray.length - (i + 1)] = temp;
        }
        return sortedArray;
    }

    @Test
    public void mergeArrayTest(){
        initialiseParameters();
        arrayMerge = new ArrayMerge(array1,array2);
        int[] mergeArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergeArray, 0, array1.length);
        System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);
        //Merged two arrays test
        assertArrayEquals(mergeArray, arrayMerge.getFinalArray());
        //Ascending sorted array test
        Arrays.sort(mergeArray);
        assertArrayEquals(mergeArray, arrayMerge.getAscSortedArray());

        //Reverse array function
        int[] reverseArraySetUp = reverseArray(mergeArray.clone());
        //Descending sorted array test
        assertArrayEquals(reverseArraySetUp, arrayMerge.getDescSortedArray());
    }
}
