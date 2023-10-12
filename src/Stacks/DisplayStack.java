package Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void DisplayRev(Stack<Integer> s){
        if(s.size()==0) return;
        int top = s.pop();
        System.out.print(top+" ");
        DisplayRev(s);
        s.push(top);

    }
    public static void Display(Stack<Integer> s){
        if(s.size()==0) return;
        int top = s.pop();
        Display(s);
        System.out.print(top+" ");

        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(50);
        st.push(100);
        st.push(150);
        st.push(200);
        st.push(250);

//        Stack<Integer> rt = new Stack<>();
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//        while (rt.size()>0){
//            int x =rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }

        // through Array
//
//        int  n = st.size();
//        int[] arr= new int[n];
//        for(int i=n-1;i>=0;i--){
//            arr[i] = st.pop();
//        }
//        for(int i=0 ; i<n ; i++){
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }

//        System.out.println(st);
//        Display(st);
//        System.out.println(st);
        Display(st);
        System.out.println();
        DisplayRev(st);

//
    }
}
