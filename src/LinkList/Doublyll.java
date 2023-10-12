package LinkList;

public class Doublyll {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    public  static void Display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void Display2(Node random){
        Node temp = random;
        while (temp.prev!=null){
            temp=temp.prev;
        }
        // now temp is a ar head
        // print the list
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();


    }

    public static Node insertAtHead(Node head,int x){
        Node t = new Node(x);
        t.next = head;
        head.prev=t;
        head=t;
        return head;
    }

    public static void insertAtTail(Node head , int x){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t =new Node(x);
        temp.next = t;
        t.prev=temp;
    }
    public static Node deletHead(Node head){
        Node temp = head;
        head=head.next;
        head.prev=null;
        return head;

    }

    public static Node deletTail(Node  head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.prev.next=null;
        return head;
    }

    public static Node deletIndex(Node head,int ind){
        if(ind<=1){
            return deletHead(head);
        }
        Node temp = head;
        for(int i=1;i<ind;i++){
            if(temp==null){
                return head;
            }
            temp=temp.next;
        }
        if(temp==null) return head;
        temp.prev.next = temp.next;
        return head;
    }


    public  static void DisplayRev(Node tail){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(54);
        Node c= new Node(7);
        Node d = new Node(11);
        Node e = new Node(98);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;

        Display(a);
//        insertAtTail(a,66);
//        Display(a);
//        DisplayRev(e);
//        Display2(c);
//        Node newHead = insertAtHead(a,35);
//        Display2(newHead);
//        Node tail1 = deletTail(a);
        Node head2 = deletIndex(a,3);
//        Display(tail1);
        Display(head2);
    }

}
