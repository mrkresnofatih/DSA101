package tech.fatih.dsa101;

import tech.fatih.dsa101.classes.ArrayStack;
import tech.fatih.dsa101.classes.SingleLinkedList;
import tech.fatih.dsa101.classes.SingleLinkedListQueue;
import tech.fatih.dsa101.classes.SingleLinkedListStack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        doLinkedListQueueCase();
    }

    public static void doLinkedListQueueCase() {
        SingleLinkedListQueue list = new SingleLinkedListQueue();
        list.enter(4);
        list.displayQueue();
        list.enter(5);
        list.displayQueue();
        list.enter(6);
        list.displayQueue();
        list.enter(7);
        list.displayQueue();
        list.exit();
        list.displayQueue();
    }

    public static void doSingleLinkedListStackCase() {
        SingleLinkedListStack stack = new SingleLinkedListStack();
        stack.push(6);
        stack.displayStack();
        stack.push(7);
        stack.displayStack();
        stack.push(8);
        stack.displayStack();
        stack.push(9);
        stack.displayStack();
        stack.pop();
        stack.displayStack();
    }

    public static void doArrayStackCase() {
        ArrayStack firstStack = new ArrayStack(5);
        firstStack.push(1);
        firstStack.displayArrayStack();

        firstStack.push(2);
        firstStack.displayArrayStack();

        firstStack.push(3);
        firstStack.displayArrayStack();

        firstStack.push(4);
        firstStack.displayArrayStack();

        firstStack.push(5);
        firstStack.displayArrayStack();

        firstStack.pop();
        firstStack.displayArrayStack();

        firstStack.push(8);
        firstStack.displayArrayStack();
    }

    public static void doSingleLinkedListCase() {
        SingleLinkedList firstList = new SingleLinkedList();

        firstList.autoInsert(10);
        firstList.displayLinkedList();

        firstList.bubbleSortByData(SingleLinkedList.SortType.Descend);
        firstList.displayLinkedList();

        firstList.bubbleSortByData(SingleLinkedList.SortType.Ascend);
        firstList.displayLinkedList();

        firstList.reverseLinkedList();
        firstList.displayLinkedList();

        firstList.insertAtIndex(677, 3);
        firstList.displayLinkedList();

        firstList.insertAtBeginning(70);
        firstList.displayLinkedList();

        firstList.insertAtEnd(900);
        firstList.displayLinkedList();

        firstList.deleteAtBeginning();
        firstList.displayLinkedList();

        firstList.deleteAtEnd();
        firstList.displayLinkedList();

        firstList.deleteAtIndex(6);
        firstList.displayLinkedList();
    }
}
