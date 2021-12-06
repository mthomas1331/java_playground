package challenges.week_2.array_merge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMergeTests {

    int[] array1, array2;
    ArrayMerge arrayMerge;

    public void initialiseParameters(){

        Random random = new Random();
        array1 = new int[random.nextInt(100)];
        array2 = new int[random.nextInt(100)];
        for (int element: array1) {
            array1[element] = random.nextInt();
        }
        for (int element : array2) {
            array2[element] = random.nextInt();
        }
    }

    @Test
    public void mergeArrayTest(){
        initialiseParameters();
        arrayMerge = new ArrayMerge(array1,array2);
        int[] mergeArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergeArray, 0, array1.length);
        System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);
        //arrayMerge = new ArrayMerge(array1, array2);

        assertArrayEquals(mergeArray, arrayMerge.getFinalArray());
        

    }
}
