package core.collections;

import java.util.HashSet;
import java.util.Set;

public class SetsExample {

    private Set<String> mySet = new HashSet<>();


    //Sets used for no duplicates data
    public SetsExample() {
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");
        //duplicate data is ignored
        mySet.add("one");
    }

    public void printSet(){
        for (String num: mySet) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        SetsExample setsExample = new SetsExample();
        setsExample.printSet();
    }
}
