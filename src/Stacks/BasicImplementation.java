package Stacks;

import java.util.Stack;

public class BasicImplementation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(50);
        st.push(100);
        st.push(150);
        st.push(200);
        st.push(250);


        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
