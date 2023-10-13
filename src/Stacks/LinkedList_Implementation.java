package Stacks;

public class LinkedList_Implementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLstack{
        Node head=null;
       private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty") ;
                return -1;
            }
            int x = head.val;
            head=head.next;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
displayrec(head);
            System.out.println();
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){ // getter
            return size;
        }

    }




    public static void main(String[] args) {
        LLstack st = new LLstack();
        st.push(4);
        st.push(6);
        st.push(10);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(10);
        st.push(00);
        st.push(10);
        st.push(90);
        st.push(70);
        st.push(10);
        System.out.println(st.size());
    }
}
