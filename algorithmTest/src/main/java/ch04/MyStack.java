package ch04;

public class MyStack {
    private int maxSize; //스택최대크기를 저장한 변수
    private int[] stackArray; //스택 데이터를 저장할 배열
    private int top; //스택의 최상위 요소를 가리키는 인덱스

    //스택의 크기를 받아들이는 생성자
    public MyStack(int stackSize){
        this.maxSize = stackSize;
        this.stackArray = new int[stackSize];
        this.top = -1;
    }
    //스택에 요소를 추가하는 메서드
    public void push(int value){
        if(!isFull()){ //스택이 가득찼는지 알아봄
            stackArray[++top] = value;
        }else{
            System.out.println("스택이 가득 찼습니다.");
        }

    }
    //스택에 요소를 제거하는 메소드
    public int pop(){
        //스택에 더이상 데이터가 없는지 확인
        if(isEmpty()){
            System.out.println("스택이 비었습니다.");
            return -1;
        }else {
            return stackArray[top--];
        }
    }
    //스택의 가장위에 있는 요소가 무엇인지 알려주는 메소드
    public int peek(){
        if(isEmpty()){
            System.out.println("스택이 비었습니다.");
            return -1;
        }else {
            return stackArray[top];
        }
    }
    //스택이 비었는지 알려주는 메소드
    public boolean isEmpty(){

        return top == -1;
    }
    //스택이 가득 찼는지 확인하는 메서드  //isFull
    public boolean isFull(){
        return top == maxSize -1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);  //크기를 받아 들이도록 설계해주세요.
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());//3
        System.out.println(stack.peek());//2
        System.out.println(stack.isEmpty()); //false
        System.out.println(stack.pop()); //2
        System.out.println(stack.pop()); //1
        System.out.println(stack.isEmpty()); //true



    }
}
