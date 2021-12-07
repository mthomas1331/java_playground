package challenges.week_2.array_merge;

public class ArrayMerge {

    private final int[] intArr1, intArr2, finalArray, ascSortedArray;// descSortedArray;

    public ArrayMerge(int[] intArr1, int[] intArr2) {
        this.intArr1 = intArr1;
        this.intArr2 = intArr2;
        //merge two arrays method call
        finalArray = mergedArray();
        ascSortedArray = sortArrayAsc(finalArray.clone());
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
    private int[] sortArrayAsc(int[] unsortedArray){
        int temp;
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = 0; j < unsortedArray.length; j++) {
                if (unsortedArray[i] < unsortedArray[j]) {
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[i];
                    unsortedArray[i] = temp;
                }
            }
        }
        return unsortedArray;
    }

    /*private int[] sortArrayDesc(){

        return descSortedArray;

    }*/


    //getter for testing purpose
    public int[] getFinalArray() {
        return finalArray;
    }

    public int[] getAscSortedArray() {
        return ascSortedArray;
    }

    /*public int[] getDescSortedArray() {
        return descSortedArray;
    }*/
}
