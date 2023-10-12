package LinkList;

public class nthNodeFromLast {

    public static Node nthNode(Node head,int n){
        Node temp = head;
        int size=0;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        int a = size-n+1;
        temp=head;
        for(int i=1;i<=a-1;i++){
            temp=temp.next;
        }
        return temp;

    }

    public  static Node nthNodeInSingleTraversel(Node head,int n){
        Node slow= head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        while (fast!=null){
            slow =slow.next;
            fast=fast.next;
        }
        return slow;
    }

    // deleting nth node from end
    public  static Node deletNth(Node head ,int n){
        Node slow= head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
           return head;
        }
        while (fast.next!=null){
            slow =slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }


    public static Node middleOfLL(Node head){
        Node slow=head;
        Node fast = head;
        while(fast!= null && fast.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
       return head;
    }

 /// deleting middel element

    public static Node deletMiddle(Node head){
        Node slow=head;
        Node fast = head;
        while(fast.next.next!= null && fast.next.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return slow;
    }

    public static void Display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public  static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }


    }

    public static void main(String[] args) {
     Node a = new Node(15);
     Node b = new Node(80);
     Node c= new Node(4);
     Node d = new Node(11);
     Node e  =  new Node(45);
        Node f  =  new Node(415);

        a.next =b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

//        Node temp = nthNode(a, 2);
//        System.out.println(temp.data);
//
//        Node temp2 = nthNodeInSingleTraversel(a,2);
//        System.out.println(temp2.data);
//
//     Display(a);
//     a=deletNth(a,5);
     Display(a);
//        System.out.println(middleOfLL(a));
        Node t=deletMiddle(a);
        Display(a);
    }
}
