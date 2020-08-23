package Stack;

public interface Stackable <T>{
    void push(T data);
    T pop();
    T peek();
    boolean empty();
    int size();
    void printall();
    void clear();
}
