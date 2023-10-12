package LinkList;

public class reverse_List {
    public static class Node{
        int data;
         Node next;

         Node(int data){
             this.data=data;
         }

    }

//    static void RecDisplayRev(Node head){
//        if(head==null) return;
//        RecDisplayRev(head.next);
//        System.out.print(head.data +" ");
//
//    }


//    static void RecDisplay(Node head){
//        if(head==null) return;
//        System.out.print(head.data +" ");
//        RecDisplay(head.next);
//    }

    public static Node reverse(Node head){
        if(head.next==null) return head;
        Node newhead = reverse(head.next);
        head.next.next = head;
        head.next=null;
        return newhead;
    }


    static void Display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node a  = new Node(12);
        Node b  = new Node(82);
        Node c  = new Node(72);
        Node d  = new Node(52);
        Node e  = new Node(22);
        Node f  = new Node(32);

        a.next =b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

//        RecDisplay(a);
//        System.out.println();
//        RecDisplayRev(a);
        Display(a);
        System.out.println();
        Node temp = reverse(a);
        Display(temp);
    }
}
