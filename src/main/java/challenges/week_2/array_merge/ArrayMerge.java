package challenges.week_2.array_merge;

public class ArrayMerge {

    private int[] intArr1, intArr2, finalArray;


    public ArrayMerge(int[] intArr1, int[] intArr2) {
        this.intArr1 = intArr1;
        this.intArr2 = intArr2;
        finalArray = mergedArray();
    }

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

    //getter for testing purpose
    public int[] getFinalArray() {
        return finalArray;
    }


}
