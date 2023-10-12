package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter No of elemnts:");
        n = sc.nextInt();
        System.out.println("enter elements");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while (st.size()>0){
//            int x  = st.peek();
            rt.push(st.pop());
//            st.pop();
        }
        System.out.println(rt);

        Stack<Integer> gt = new Stack<>();
        while (rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
