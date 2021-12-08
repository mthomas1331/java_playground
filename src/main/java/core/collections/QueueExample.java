package core.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    private Queue<String> myQueue = new LinkedList<>();

    public QueueExample(){
        myQueue.add("one");
        myQueue.add("two");
        myQueue.add("three");
    }

    public void queueFeatures(){
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
    }

    public static void main(String[] args) {
        QueueExample queueExample = new QueueExample();
        queueExample.queueFeatures();
    }
}
