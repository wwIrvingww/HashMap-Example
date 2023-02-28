public class Stack <T> {
    private int[] elements;
    private int top;
    private int size;

    public Stack(int size) {
        elements = new int[size];
        top = -1;
        this.size = size;
    }

    public void push(T element) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            elements[++top] = (int) element;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return elements[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return elements[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}
