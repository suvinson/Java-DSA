class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class Double_link
{
    Node head=null;

    void insertBegining(int data){
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            return;
        }
        newnode.next=head;
        head.prev = newnode;
        head = newnode;
    }
    void insertEnding(int data)
    {
        if(head == null)
        {
            insertBegining(data);
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node newnode = new Node(data);
        temp.next=newnode;
        newnode.prev=temp;
    }
    void insertMiddle(int index , int data)
    {
        if(index<0)
        {
            System.out.println("Invalid index");
        }
        Node temp = head;
        for(int i=0;i<index-1;i++)
        {
            temp = temp.next;
        }
        Node newnode = new Node(data);
        newnode.next = temp.next;
        temp.next = newnode;
        newnode.prev = temp;
        temp.next.prev = newnode;
    }
    void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null)
        {
            next = current.next;  //first node next
            current.next = prev;  //first next is null now 
            prev = current;       // reversed node 
            current = next;       //move to the next 
        }
        head = prev;
    }
    void delete(int data){
        Node temp = head;
        if(temp.data == data)
        {
            head = head.next;
            return;
        }
        while(temp.next!=null && temp.next.data!= data)
        {
            temp = temp.next;
        }
        if(temp.next == null)
        {
            System.out.println("Invalid index");
            return;
        }
        temp.next = temp.next.next;
        if(temp.next == null)
        {
            return;
        }
        temp.next.next.prev = temp;
    }
    void deleteIndex(int index)
    {
        if(index<0)
        {
            System.out.println("Invalid index");
        }
        Node temp = head;
        if(temp.next == null)
        {
            head = head.next;
            return;
        }
        for(int i=0;i<index-1;i++)
        {
            temp = temp.next;
        }
        if(temp.next == null || temp == null) 
        {
            return;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    void search(int data){
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data == data){
                System.out.println(true);
                return;
            }
            temp=temp.next;
        }
        System.out.println(false);
    }
    void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String arg[]){
        Double_link l = new Double_link();
        l.insertBegining(1);
        l.insertBegining(2);
        l.insertBegining(3);
        l.display();

        

        l.insertEnding(4);
        System.out.println();
        l.display();

        l.insertMiddle(2,5);
        System.out.println();
        l.display();

        l.delete(2);
        System.out.println();
        l.display();

        l.deleteIndex(2);
        System.out.println();
        l.display();
        
    }

}