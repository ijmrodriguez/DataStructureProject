public class QueueLinkedList
{
    private Node front;
    private Node rear;

    public QueueLinkedList()
    {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(Student student)
    {
        Node newNode = new Node(student);
        newNode.setData(student);
        if (rear == null)
        {
            front = newNode;
        }
        else
        {
            rear.setNext(newNode);
        }
        rear = newNode;
    }

    public Student dequeue()
    {
        if(front == null)
        {
            throw new IllegalStateException("Queue is empty");
        }
        Student data = front.getData();
        front = front.getNext();
        if(front == null)
        {
            rear = null;
        }
        return data;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public void display()
    {
        Node current = front;
        while(current != null)
        {
            System.out.println("Name: " + current.getData().getName() + ", Age: " + current.getData().getAge() +
                    ", GPA: " + current.getData().getGpa());
            current = current.getNext();
        }
    }
}
