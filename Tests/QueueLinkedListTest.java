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
       assertFalse(queue.isEmpty());
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

    @Test //6
    public void testEnqueueMultiple()
    {
        QueueLinkedList queue = new QueueLinkedList();
        Student hannah = new Student("Hannah", 16, 3.6);
        Student stephanie = new Student("Stephanie", 14, 4.2);
        Student russel = new Student("Russel", 17, 4.0);

        queue.enqueue(hannah);
        queue.enqueue(stephanie);
        queue.enqueue(russel);
        assertEquals(hannah, queue.dequeue());
        assertEquals(stephanie, queue.dequeue());
        assertEquals(russel, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test //7
    public void testDisplay()
    {
        QueueLinkedList queue = new QueueLinkedList();
        Student danny = new Student("Danny", 15, 3.2);
        Student cameron = new Student("Cameron", 16, 4.3);

        queue.enqueue(danny);
        queue.enqueue(cameron);
        queue.display();
        assertFalse(queue.isEmpty());
    }

    @Test //8
    public void testDisplayEmptyQueue()
    {
        QueueLinkedList queue = new QueueLinkedList();
        queue.display();
        assertTrue(queue.isEmpty());
    }

    @Test (timeout = 1000) //9
    public void testPerformance()
    {
        QueueLinkedList queue = new QueueLinkedList();
        for(int i = 0; i < 1000000; i++)
        {
            queue.enqueue(new Student("Student" + i, 20 + i, 3.0 + (i* 0.1)));
        }
        assertFalse(queue.isEmpty());
        for(int i = 0; i < 1000000; i++)
        {
            assertNotNull(queue.dequeue());
        }
        assertTrue(queue.isEmpty());
    }

    @Test //10
    public void testQueueState()
    {
        QueueLinkedList queue = new QueueLinkedList();
        Student henry = new Student("Henry", 15, 3.8);
        Student joaquin = new Student("Joaquin", 14, 4.2);
        Student ben = new Student("Ben", 13, 3.3);

        queue.enqueue(henry);
        assertFalse(queue.isEmpty());
        queue.enqueue(joaquin);
        queue.enqueue(ben);
        assertEquals(henry, queue.dequeue());
        assertEquals(joaquin, queue.dequeue());
        assertEquals(ben, queue.dequeue());
        assertTrue(queue.isEmpty());
    }
}
