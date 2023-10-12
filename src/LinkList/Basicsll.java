package LinkList;

public class Basicsll {

//    public static void display(Node head){
//        Node temp = head;
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp =temp.next;
//        }
//    }

    // Recursively
//
//    public static  void DisplayRec(Node head){
//        if(head==null) return;
//        System.out.print(head.data+" ");
//        DisplayRec(head.next);
//    }
//
//    // Recursively but print in reverse oredr
//    public static  void DisplayRev(Node head){
//        if(head==null) return;
//        DisplayRec(head.next);
//        System.out.print(head.data+" ");
//
//    }

   // length count
   public  static  int lentthcount(Node head) {
       int count = 0;
       while (head != null) {
           count++;
           head = head.next;
       }
       return count;
   }
       public  static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(5);
        Node b =new Node(7);
        Node c =new Node(3);
        Node d =new Node(52);
        Node e =new Node(15);

        a.next =b;
        b.next=c;
        c.next=d;
        d.next=e;
//
//        System.out.println(b.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);


        // for displaying linklist
//        Node temp =a;
//        for(int i=1;i<=5;i++)
//        {
//            System.out.print(temp.data + " ");
//            temp =temp.next;
//
//        }


        // using while loop

//        Node temp=a;
//        while (temp!=null){
//            System.out.print(temp.data +" ");
//            temp=temp.next;
//        }

//        display(a);
//        DisplayRec(a);
//        System.out.println();
//        DisplayRev(a);
        System.out.println(lentthcount(a));
    }
}
