package Stacks;

import java.util.Stack;

public class RemoveFromBotttom_AnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(50);
        st.push(100);
        st.push(150);
        st.push(200);
        st.push(250);
        System.out.print(st+" ");
        System.out.println();
        Stack<Integer>  rt = new Stack<>();
        while (st.size()>3){
            rt.push(st.pop());
        }
        st.pop();
        while (rt.size()>0){
            st.push(rt.pop());
        }

        System.out.print(st);


    }
}
