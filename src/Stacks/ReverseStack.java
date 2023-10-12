package Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }

    static void pushAtBottom(Stack<Integer> st , int n){
        if(st.size()==0) {
            st.push(n);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,n);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(50);
        st.push(100);
        st.push(150);
        st.push(200);
        st.push(250);
//        System.out.print(st+" ");
//        System.out.println();

//        Stack<Integer> qt = new Stack<>();
//        while(st.size()>0){
//            qt.push(st.pop());
//        }
//        System.out.print(qt+" ");
//        System.out.println();
//
//        Stack<Integer> rt = new Stack<>();
//        while(qt.size()>0){
//            rt.push(qt.pop());
//        }
//        System.out.print(rt+" ");
//        System.out.println();
//
//        while (rt.size()>0){
//            st.push(rt.pop());
//
//        }
//
//        System.out.print(st+" ");
        System.out.println(st);
        reverse(st);
        System.out.print(st+" ");
    }
}
