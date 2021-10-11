package tech.fatih.dsa101.classes;

import java.util.Objects;

/**
 * A linked list with only reference of next node and info
 */
public class SingleLinkedList {
    private Node start;

    public SingleLinkedList() {
        start = null;
    }

    /**
     * A void method that adds linked list nodes at the end of the list
     *
     * @param length an integer that specifies the number of nodes to be added
     * @see SingleLinkedList
     */
    public void autoInsert(int length) {
        for (int i = 0; i < length; i++) {
            insertAtEnd(i + 1);
        }
    }

    public int getSize(){
        Node temp = start;
        int i = 0;
        while(!Objects.isNull(temp)){
            i++;
            temp = temp.getNext();
        }
        return i;
    }

    /**
     * A void method that adds a single node at the beginning of the list
     *
     * @param info an integer info for the node to be added
     */
    public void insertAtBeginning(int info) {
        Node temp = start;
        Node newNode = new Node(info, temp);
        this.start = newNode;
    }


    /**
     * A void method that adds a single node at the end of the list
     *
     * @param info an integer info for the node to be added
     */
    public void insertAtEnd(int info) {
        Node newNode = new Node(info);
        if (Objects.isNull(start)) {
            this.start = newNode;
        } else {
            Node temp = start;
            while (!Objects.isNull(temp.getNext())) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    /**
     * A void method that adds a single node at a certain index of the list
     *
     * @param info  an integer info for the node to be added
     * @param index an integer count of nodes with 1 as first node
     */
    public void insertAtIndex(int info, int index) {
        int count = 1;
        Node temp = start;
        while (count < index) {
            temp = temp.getNext();
            count++;
        }
        int currentInfo = temp.getInfo();
        temp.setInfo(info);
        temp.setNext(new Node(currentInfo, temp.getNext()));
    }

    /**
     * A void method that sets the second node as the first
     */
    public void deleteAtBeginning() {
        if (!Objects.isNull(start)) {
            Node nextOfStart = start.getNext();
            this.start = nextOfStart;
        }
    }

    /**
     * A void method that sets the last node as null
     */
    public void deleteAtEnd() {
        Node temp = start;
        while (!Objects.isNull(temp.getNext()) && !Objects.isNull(temp.getNext().getNext())) {
            temp = temp.getNext();
        }
        temp.setNext(null);
    }

    /**
     * A void method that sets the node at index as next of index
     */
    public void deleteAtIndex(int index) {
        int count = 1;
        Node temp = start;
        while (count < index) {
            temp = temp.getNext();
            count++;
        }
        Node nextOfTemp = temp.getNext();
        temp.setInfo(nextOfTemp.getInfo());
        temp.setNext(nextOfTemp.getNext());
    }

    /**
     * A void method to reverse a linked list
     */
    public void reverseLinkedList() {
        Node prev, next, temp;
        prev = null;
        temp = start;
        int count = 0;
        while (!Objects.isNull(temp)) {
            next = temp.getNext();
            temp.setNext(prev);
            prev = temp;
            temp = next;
        }
        start = prev;
    }

    /**
     * A void method that prints all elements in a single line
     */
    public void displayLinkedList() {
        Node temp = start;
        while (!Objects.isNull(temp)) {
            System.out.print(temp.getInfo() + " ");
            temp = temp.getNext();
        }
        System.out.println();
        System.out.println();
    }

    /**
     * A void method that sorts the linked list
     *
     * @param sortType string, call SingleLinkedList SortType, can be Ascend or Descend
     */
    public void bubbleSortByData(String sortType) {
        Node a, b, end, firstNode, secondNode;
        end = null;
        firstNode = start;
        secondNode = start.getNext();
        while (!(end == secondNode)) {
            a = firstNode;
            b = secondNode;
            while (!(b.getNext() == end)) {
                if (sortType == SortType.Ascend ?
                        (a.getInfo() > b.getInfo()) : (a.getInfo() < b.getInfo())) {
                    int temp = a.getInfo();
                    a.setInfo(b.getInfo());
                    b.setInfo(temp);
                }
                a = a.getNext();
                b = b.getNext();
            }
            int temp = a.getInfo();
            a.setInfo(b.getInfo());
            b.setInfo(temp);
            end = b;
        }
    }

    public class SortType {
        public static final String Ascend = "Ascend";
        public static final String Descend = "Descend";
    }
}
