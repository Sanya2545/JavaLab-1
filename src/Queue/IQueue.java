package Queue;

public interface IQueue<T> {
    void push(T item);
    T pop();
    boolean isEmpty();
    boolean isFull();
}
