 
class Node{
    int coef;
    int expo;
    Node next;

    Node(int coef,int expo){
        this.coef=coef;
        this.expo= expo;
        this.next=null;
    }
}
class Link
{
    Node head=null;
    void insertBegining(int coef, int expo){
        Node newnode = new Node(coef,expo);
        newnode.next = head;
        head = newnode;
    }
    void insertEnding(int coef,int expo)
    {
        if(head == null)
        {
            insertBegining(coef,expo);
            return;
        }
        Node newnode = new Node(coef,expo);
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next=newnode;
    }
    void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.coef + " X^"+temp.expo + " + ");
            temp=temp.next;
        }
        System.out.println();
        
    }
}
public class Polynomial_linkedlist{
    static Link p;
    static void addLinkedlist(Node p1,Node p2){
        p = new Link();
        while(p1!=null && p2!=null)
        {
            if(p1.expo == p2.expo)
            {
                p.insertEnding(p1.coef+p2.coef,p1.expo);
                p1 = p1.next;
                p2 = p2.next;
            }
            else if(p1.expo > p2.expo)
            {
                p.insertEnding(p1.coef,p1.expo);
                p1 = p1.next;
            }
            else if(p2.expo > p1.expo)
            {
                p.insertEnding(p2.coef,p2.expo);
                p2 = p2.next;
            }
        }
        while(p1!=null)
        {
            p.insertEnding(p1.coef,p1.expo);
            p1 = p1.next;
        }
        while(p2!=null)
        {
            p.insertEnding(p2.coef,p2.expo);
            p2 = p2.next;
        }
    }
     public static void main(String arg[]){
        Link p1 = new Link();
        Link p2 = new Link();
        p1.insertBegining(3,2);
        p1.insertBegining(4,1);
        p1.insertBegining(1,0);
        p1.display();
        p2.insertBegining(3,2);
        //p2.insertBegining(4,1);
        p2.insertBegining(1,0);
        p2.display();

        addLinkedlist(p1.head,p2.head);
        p.display();
     }
}
