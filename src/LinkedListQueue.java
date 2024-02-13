import java.util.LinkedList;
public class LinkedListQueue<T>
{
    private LinkedList<T> queue;

    public LinkedListQueue()
    {
        queue = new LinkedList<>();
    }

    public void enqueue(T item)
    {
        queue.addLast(item);
    }

    public T dequeue()
    {
        return queue.poll();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public int size()
    {
        return queue.size();
    }
}
