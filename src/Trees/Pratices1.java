package Trees;

import java.util.Scanner;

public class Pratices1 {

    public Pratices1(){

    }
    private static class Node{
       private int value;
      private   Node right;
       private Node left;

       public Node(int value){
           this.value=value;

       }
    }

    private Node root;

     public void populate(Scanner scanner){
         System.out.println("Enter Root node of the tree");
         int value = scanner.nextInt();
         root = new Node(value);
         populate(scanner,root);
     }
     public void populate(Scanner scanner , Node node){
         System.out.println("Do you want to enter left of :"+node.value);
         boolean left = scanner.nextBoolean();
         if(left){
             System.out.println("Enter the left value of "+node.value);
             int value = scanner.nextInt();
             node.left = new Node(value);
             populate(scanner,node.left);
         }

         System.out.println("Do you want to enter right of :"+node.value);
         boolean right = scanner.nextBoolean();
         if(right){
             System.out.println("Enter the left value of "+node.value);
             int value = scanner.nextInt();
             node.right = new Node(value);
             populate(scanner,node.right);
         }
     }

    public void display(){

        display(root,"");
    }

    private void display(Pratices1.Node node , String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+ node.value);
        display(node.left,indent + "\t");
        display(node.right ,indent + "\t");
    }


    // Traversal Methods
    public void preOrder(){
         preOrder(root);
    }

    private void preOrder(Node node){
         if(root==null){
             return;
         }
        System.out.println(node.value+" ");
         preOrder(node.left);
         preOrder(node.right);
    }

    public void inOrder(){
         inOrder(root);
    }
    private void inOrder(Node node){
         if(node==null){
             return;
         }
         inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }

    public void postOrder(){
         postOrder(root);
    }
    private void postOrder(Node node){
         if(node==null){
             return;
         }
         postOrder(node.left);
         postOrder(node.right);
        System.out.println(node.value+" n");

    }


    // Binary search tree





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pratices1 tree = new Pratices1();
        tree.populate(sc);
    }

}
