class Node 
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Linkedlist
{
    Node head=null;

    void insertbegining(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    void insertending(int data){
        if(head==null)
        {
            insertbegining(data);
        }
        Node newnode =new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void insertmid(int index , int data)
    {
        if(index<0)
        {
            System.out.println("Invalid index");
        }
        Node temp = head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        Node newnode = new Node(data);
        newnode.next = temp.next;
        temp.next = newnode;
    }
    void display()
    {
      Node temp=head;
      while(temp!=null)
      {
          System.out.print(temp.data+" ");
          temp=temp.next;
      }
      System.out.print("null");
    }

    public static void main(String args[])
    {
        Linkedlist list=new Linkedlist();
        System.out.println("Inserting at the begining");
        list.insertbegining(1);
        list.display();
        System.out.println();
        list.insertbegining(2);
        list.display();
        System.out.println();
        list.insertbegining(3);
        list.display();
        System.out.println();

        System.out.println("Inserting at the end");

        list.insertending(4);
        list.display();
        System.out.println();

        System.out.println("Inserting at the middle");
        list.insertmid(2,5);
        list.display();


    }

}

