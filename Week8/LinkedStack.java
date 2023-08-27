package Tool;

public class LinkedStack<T> implements IStack<T>{

    class Node {
        T data;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }

        Node(T data, Node tail){
            this.data = data;
            this.next = tail;
        }
    }

    Node top; // index of the top of the stack, 0 if empty

    public LinkedStack(){
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean push(T value) {
        top = new Node(value, top);
        return true;
    }

    @Override
    public T peek() {
        if(top == null){
            return null;
        }
        return top.data;
    }

    @Override
    public T pop() {
        if(top == null){
            return null;
        }
        T value = peek();
        top = top.next;
        return value;
    }
    
}