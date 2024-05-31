package ch04;

public class FixedLengthQueue {
    private int[] queueArray;    // 큐를 저장할 배열
    private int queueCapacity;   // 큐의 최대 크기
    private int front;           // 첫 번째 요소를 가리키는 인덱스
    private int rear;            // 마지막 요소의 다음 위치를 가리키는 인덱스
    private int currentSize;     // 현재 큐에 저장된 요소의 개수

    public class QueueEmptyException extends RuntimeException {
        public QueueEmptyException() {}
    }

    public class QueueFullException extends RuntimeException {
        public QueueFullException() {}
    }

    public FixedLengthQueue(int maxSize) {
        currentSize = front = rear = 0;
        queueCapacity = maxSize;
        queueArray = new int[queueCapacity];
    }
    public int enqueue(int item) {
        if (currentSize >= queueCapacity)
            throw new QueueFullException();
        queueArray[rear] = item;
        rear = (rear + 1) % queueCapacity;
        currentSize++;
        return item;
    }

    public int dequeue() {
        if (currentSize <= 0)
            throw new QueueEmptyException();
        int item = queueArray[front];
        front = (front + 1) % queueCapacity;
        currentSize--;
        return item;
    }

    public int peek() {
        if (currentSize <= 0)
            throw new QueueEmptyException();
        return queueArray[front];
    }
    public void clear() {
        currentSize = front = rear = 0;
    }

    public int indexOf(int item) {
        for (int i = 0; i < currentSize; i++) {
            int index = (front + i) % queueCapacity;
            if (queueArray[index] == item)
                return index;
        }
        return -1;
    }

    public int getCapacity() {
        return queueCapacity;
    }

    public int size() {
        return currentSize;
    }
    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == queueCapacity;
    }

    public void dump() {
        if (currentSize <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = 0; i < currentSize; i++) {
                System.out.print(queueArray[(front + i) % queueCapacity] + " ");
            }
            System.out.println();
        }
    }
}