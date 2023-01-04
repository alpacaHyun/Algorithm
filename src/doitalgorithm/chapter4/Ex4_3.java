package doitalgorithm.chapter4;

public class Ex4_3 {

    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException(){}
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException(){}
    }


    public Ex4_3(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError error) {
            max = 0;
        }
    }
}
