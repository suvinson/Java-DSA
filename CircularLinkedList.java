class CircularLinkedList<T>
{
    class Node
    {
        T data;
        Node next;
        Node(T data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node tail;

    CircularLinkedList()
    {
        tail = null;
    }
    void insertBegining(T data)
    {
        Node newNode = new Node(data);
        if(tail == null)
        {
            newNode.next = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next =tail.next;
            tail.next = newNode;
        }
    }
    void insertEnding(T data)
    {
        Node newNode = new Node(data);
        if(tail == null)
        {
            newNode.next = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next =tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }
    void delete()
    {
        if(tail == null)
        {
            System.out.println("Empty node");
            return;
        }
        if(tail.next == tail)
        {
            tail = null;
            return; 
        }
        else
        {
            tail.next = tail.next.next;   
        }
    }
    void deleteLast()
    {
        if(tail == null)
        {
            System.out.println("Empty node");
            return;
        }
        if(tail.next == tail)
        {
            tail = null;
            return; 
        }
        else
        {
            Node temp = tail;
            while(temp.next != tail)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }
    }

    void display()
    {
        Node temp = tail;
        System.out.println();
        do{
            System.out.print(temp.data + "->");
            temp = temp.next;
        }while(temp!=tail);
    }

    public static void main(String arg[])
    {
        CircularLinkedList <Integer> list = new CircularLinkedList<>(); 

        list.insertBegining(7);
        list.insertBegining(5);
        list.insertBegining(3);

        list.display();
        
        list.delete();
        list.display();

        list.insertEnding(2);
        list.display();

        list.deleteLast();
        list.display();
    }
}