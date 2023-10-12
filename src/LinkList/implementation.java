package LinkList;

public class implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }

    public  static  class linkedlist{
        Node head =  null;
        Node tail = null;

        int size=0;

        void insertAtEnd(int val){
            Node temp =new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else {
                tail.next=temp;
                tail=temp;
            }
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else {
                temp.next=head;
                head=temp;
            }
        }

        void insertAt(int index,int val){
            Node t = new Node(val);
            Node temp =head;
            if(index==size()){
                insertAtEnd(val);
            } else {
                insertAtHead(val);
            }
            for(int i=1;i<=index-1;i++){
                temp=temp.next;
            }
            t.next = temp.next;
            temp.next=t;
        }

        int getAt(int index){
            Node temp = head;
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void Display(){
            Node temp = head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        int size(){
            Node temp = head;
            int count = 0;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(75);
        ll.insertAtEnd(51);

//        ll.Display();
        System.out.println();
//        System.out.println(ll.size());
        ll.insertAtEnd(41);
//        ll.Display();
        System.out.println();
        ll.insertAtHead(10);
//        ll.Display();

        ll.insertAt(2,151);
        ll.Display();

        System.out.println(ll.getAt(2));
    }
}
