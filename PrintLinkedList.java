public class PrintLinkedList{

    public static void display(Node head){

        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.getdata() + " -> ");
            temp = temp.getnext();
        } 
        System.out.println("null");
    }
}