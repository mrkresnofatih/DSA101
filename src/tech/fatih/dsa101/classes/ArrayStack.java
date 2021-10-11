package tech.fatih.dsa101.classes;

public class ArrayStack {
    private int[] stackArray;
    private int topIndex;

    public ArrayStack(int maxSize) {
        stackArray = new int[maxSize];
        topIndex = -1;
    }

    private boolean isFull() {
        return (topIndex == stackArray.length - 1);
    }

    private boolean isEmpty() {
        return (topIndex == -1);
    }

    public void push(int info) {
        if (!isFull()) {
            topIndex++;
            stackArray[topIndex] = info;
        }
    }

    public void pop() {
        if (!isEmpty()) {
            topIndex--;
        }
    }

    public void displayArrayStack() {
        for (int i = 0; i <= topIndex; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
