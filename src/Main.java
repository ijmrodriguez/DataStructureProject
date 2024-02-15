public class Main
{
    public static void main(String[] args)
    {
        QueueLinkedList queue = new QueueLinkedList();
        Student john = new Student("John", 13, 4.0);
        Student alice = new Student("Alice", 16, 4.2);
        Student ben = new Student("Ben", 14, 3.5);

        john.setName("Johnny");
        alice.setAge(17);
        ben.setGpa(4.0);

        queue.enqueue(john);
        queue.enqueue(alice);
        queue.enqueue(ben);

        System.out.println("Data Structure Contains: ");
        queue.display();
    }
}