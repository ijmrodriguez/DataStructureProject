import org.junit.Test;

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
    public void testEnqueueNull()
    {
       QueueLinkedList queue = new QueueLinkedList();
       queue.enqueue(null);
       assertTrue(queue.isEmpty());
    }

    @Test (expected = IllegalStateException.class) //4
    public void testDequeueEmpty()
    {
        QueueLinkedList queue = new QueueLinkedList();
        queue.dequeue();
    }

    @Test //5
    public void testEnqueueDequeueMixed()
    {
        QueueLinkedList queue = new QueueLinkedList();
        Student zack = new Student("Zack", 13, 3.5);
        Student vicky = new Student("Vicky", 16, 4.0);

        queue.enqueue(zack);
        assertEquals(zack, queue.dequeue());
        queue.enqueue(vicky);
        assertFalse(queue.isEmpty());
        assertEquals(vicky, queue.dequeue());
        assertTrue(queue.isEmpty());
    }


}
