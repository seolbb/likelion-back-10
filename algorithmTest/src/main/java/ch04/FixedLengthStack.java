package ch04;

public class FixedLengthStack {
    private int[] stackArray;    // 스택을 저장할 배열
    private int stackCapacity;   // 스택의 최대 크기
    private int stackPointer;    // 스택 포인터

    // 스택이 비었을 때 발생하는 예외
    public static class StackEmptyException extends RuntimeException {
        public StackEmptyException() {}
    }

    // 스택이 가득 찼을 때 발생하는 예외
    public static class StackFullException extends RuntimeException {
        public StackFullException() {}
    }

    // 생성자
    public FixedLengthStack(int maxSize) {
        stackPointer = 0;
        stackCapacity = maxSize;
        stackArray = new int[stackCapacity];
    }
    // 스택에 데이터 추가
    public int push(int item) {
        if (stackPointer >= stackCapacity)
            throw new StackFullException();
        return stackArray[stackPointer++] = item;
    }

    // 스택에서 데이터 제거
    public int pop() {
        if (stackPointer <= 0)
            throw new StackEmptyException();
        return stackArray[--stackPointer];
    }

    // 스택의 최상단 데이터 확인
    public int peek() {
        if (stackPointer <= 0)
            throw new StackEmptyException();
        return stackArray[stackPointer - 1];
    }

    // 스택 초기화
    public void clear() {
        stackPointer = 0;
    }
    // 스택에서 특정 데이터 찾기
    public int indexOf(int item) {
        for (int i = stackPointer - 1; i >= 0; i--) {
            if (stackArray[i] == item)
                return i;
        }
        return -1;
    }

    // 스택 최대 크기 반환
    public int getCapacity() {
        return stackCapacity;
    }

    // 스택에 저장된 데이터 개수 반환
    public int size() {
        return stackPointer;
    }

    // 스택이 비어 있는지 확인
    public boolean isEmpty() {
        return stackPointer == 0;
    }
    // 스택이 가득 찼는지 확인
    public boolean isFull() {
        return stackPointer == stackCapacity;
    }

    // 스택 내용 출력
    public void dump() {
        if (stackPointer <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < stackPointer; i++)
                System.out.print(stackArray[i] + " ");
            System.out.println();
        }
    }
}