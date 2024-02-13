import org.junit.Test;

import java.util.Queue;

import static org.junit.Assert.*;

public class QueueLinkedListTest
{
    @Test //1
    public void testEnqueueDequeue()
    {
        QueueLinkedList queue = new QueueLinkedList();
        Student john = new Student("John", 17, 3.5);
        Student alice = new Student("Alice", 16, 4.0);

        queue.enqueue(john);
        queue.enqueue(alice);

        assertEquals(john, queue.dequeue());
        assertEquals(alice, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test //2
    public void testIsEmpty()
    {
        QueueLinkedList queue = new QueueLinkedList();
        assertTrue(queue.isEmpty());
        Student bob = new Student("Bob", 16, 3.4);
        queue.enqueue(bob);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test //3
    public void testEnqueueMultiple()
    {
        QueueLinkedList queue = new QueueLinkedList();
        Student chase = new Student("Chase", 15, 3.5);
        Student jordan = new Student("Jordan", 18, 2.5);
        Student trisha = new Student("Trisha", 13, 4.0);

        queue.enqueue(chase);
        queue.enqueue(jordan);
        queue.enqueue(trisha);

        assertEquals(chase, queue.dequeue());
        assertEquals(jordan, queue.dequeue());
        assertEquals(jordan, queue.dequeue());
        assertTrue(queue.isEmpty());
    }
}
