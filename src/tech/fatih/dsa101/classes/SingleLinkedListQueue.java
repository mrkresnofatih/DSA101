package tech.fatih.dsa101.classes;

public class SingleLinkedListQueue {
    private SingleLinkedList queueLinkedList;

    public SingleLinkedListQueue() {
        queueLinkedList = new SingleLinkedList();
    }

    public void enter(int info) {
        queueLinkedList.insertAtEnd(info);
    }

    public void exit() {
        if (queueLinkedList.getSize() > 0) {
            queueLinkedList.deleteAtBeginning();
        }
    }

    public void displayQueue(){
        queueLinkedList.displayLinkedList();
    }
}
