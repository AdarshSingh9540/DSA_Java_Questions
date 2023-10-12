package Stacks;

import java.util.Stack;

public class insertioinInJava {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(50);
        st.push(100);
        st.push(150);
        st.push(200);
        st.push(250);
        System.out.println(st);
        int idx = 2;
        int n = 7;

        Stack<Integer> rt = new Stack<>();
        while (st.size()>2){
            rt.push(st.pop());
        }

        st.push(n);
        while (rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);

    }
}
