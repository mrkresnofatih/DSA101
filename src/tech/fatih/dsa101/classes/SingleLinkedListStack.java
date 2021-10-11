package tech.fatih.dsa101.classes;

public class SingleLinkedListStack {
    private SingleLinkedList stackSingleLinkedList;

    public SingleLinkedListStack(){
        stackSingleLinkedList = new SingleLinkedList();
    }

    private int size(){
        return stackSingleLinkedList.getSize();
    }

    public void push(int info){
        stackSingleLinkedList.insertAtEnd(info);
    }

    public void pop(){
        if(size()>0){
            stackSingleLinkedList.deleteAtEnd();
        }
    }

    public void displayStack(){
        stackSingleLinkedList.displayLinkedList();
    }
}
