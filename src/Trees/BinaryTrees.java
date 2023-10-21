package Trees;

import javax.swing.*;
import java.util.Scanner;

public class BinaryTrees {

    public BinaryTrees(){

    }

    private static  class Node {
        int value ;
        Node left;
        Node  right;

        public Node(int value){
            this.value=value;
        }
    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node value : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }


    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value + " (true/false)?");
        boolean left = Boolean.parseBoolean(scanner.next().toLowerCase()); // Read input as String and parse it to boolean
        if (left) {
            System.out.println("Enter the value of the left child of " + node.value + ": ");
            int leftValue = scanner.nextInt();
            node.left = new Node(leftValue);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value + " (true/false)?");
        boolean right = Boolean.parseBoolean(scanner.next().toLowerCase()); // Read input as String and parse it to boolean
        if (right) {
            System.out.println("Enter the value of the right child of " + node.value + ": ");
            int rightValue = scanner.nextInt();
            node.right = new Node(rightValue);
            populate(scanner, node.right);
        }
    }


    public void display(){
        display(root,"");
    }

    private void display(Node node , String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+ node.value);
       display(node.left,indent + "\t");
       display(node.right ,indent + "\t");
    }

    public void preetyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node , int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.right,level+1);

        if(level !=0){
            for(int i=0;i<level-1;i++){
                System.out.println("|\t\t");
            }
            System.out.println("|------>"+ node.value);
        }else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTrees Tree = new BinaryTrees();
        Tree.populate(scanner);
        Tree.preetyDisplay();
    }
}
