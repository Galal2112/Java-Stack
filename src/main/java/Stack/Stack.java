package Stack;

public class Stack<T> implements Stackable<T> {
    private Node head;
    private int counter ;
    private class Node{
        T data;
        Node next;

    }
    @Override
    public void push(T data) {
        Node memorizd = head;
        head = new Node();
        head.data = data;
        head.next = memorizd;
        counter++;
    }

    @Override
    public T pop() {
        if (head == null){
            return null;
        }
        T retObj = head.data;
        head = head.next;
        counter--;
        return retObj;
    }

    @Override
    public T peek() {
        if (head == null){
            return null;
        }

        return head.data;
    }

    @Override
    public boolean empty() {
        return head == null;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void printall() {
        if (size() == 0) {
            System.out.println("Empty Stack");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public void clear() {
        head = null;
        counter = 0;
    }

}
