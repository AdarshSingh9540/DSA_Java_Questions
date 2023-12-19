package Trees;

public class practices2 {

    public static class Node{
        int value;
        Node right;
        Node left;
        int height;

        Node(int value){
            this.value=value;
        }

        public int getvalue (){
            return value;
        }
    }

    private Node root;

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public void populate(int[] nums)
    {
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int value){
       root= insert(root,value);
    }

    private Node insert(Node node,int value){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left= insert(node.left,value);
        }
        if(value>node.value){
            node.right=insert(node.right,value);
        }

        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public boolean balanced(Node node){
        if(node==null){
            return  true;
        }
        return Math.abs(height(node.left)-height(node.right))<= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root,"Root Node :");
    }
    private void display(Node node , String details){
        if(node==null){
            return;
        }

        System.out.println(details+node.value);
        display(node.left,"Left child of"+node.value+": ");
        display(node.right,"Right child of "+node.value+": ");
    }

    public static void main(String[] args) {
        practices2 tree = new practices2();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        tree.populate(nums);
        tree.display();
    }
}


