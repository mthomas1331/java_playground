package challenges.week_2.array_merge;

public class ArrayMerge {

    private final int[] intArr1, intArr2, finalArray, ascSortedArray, descSortedArray;

    public ArrayMerge(int[] intArr1, int[] intArr2) {
        this.intArr1 = intArr1;
        this.intArr2 = intArr2;
        //merge two arrays method call
        finalArray = mergedArray();
        ascSortedArray = sortArrayAsc(finalArray.clone());
        descSortedArray = sortArrayDesc(finalArray.clone());
    }

    //merge 2 arrays method
    private int[] mergedArray(){
        //Calculate the size of the merged array
        int sizeOfMergeArray = intArr1.length + intArr2.length;
        //create the merge array
        int[] mergeArray = new int[sizeOfMergeArray];

        //for loops to populate the merged array
        for (int i = 0; i < intArr1.length; i++) {
            mergeArray[i] = intArr1[i];
        }

        for (int j = 0; j < intArr2.length; j++) {
            mergeArray[(intArr1.length + j)] = intArr2[j];
        }
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
}
