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

    public static void doSwitchCaseCase(){
        int value = 7;
        switch (value){
            case    5:
                System.out.println("value: 5");
                break;
            case    4:
                System.out.println("value: 4");
                break;
            case    2:
                System.out.println("value: 2");
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    public static void doIfElseCase(){
        int val = 5;
        if(val>8){
            System.out.println(">8");
        } else {
            System.out.println("<=8");
        }
    }

    public static void doDoWhileLoopCase(){
        // do while
        int value = 0;
        do {
            value++;
            System.out.println("val: "+value);
        } while (value<10);
    }

    public static void doWhileLoopCase(){
        // while
        int value = 0;
        while(value<10){
            value++;
            System.out.println("val: "+value);
        }
    }

    public static void doForLoopCase(){
        for(int val=0; val<10; val++){
            System.out.println(val+1);
        }
    }

    public static void doForEachLoop(){
        String[] foods = new String[] {"pisang", "apel", "mangga"};
        for(String food : foods){
            System.out.println(food);
        }
    }
}
