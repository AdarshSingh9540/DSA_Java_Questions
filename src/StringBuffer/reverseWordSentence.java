package StringBuffer;

public class reverseWordSentence {
    public static void main(String[] args) {
        String str = "Hi Guys This is adarsh singh";
        String ans = "";

        StringBuilder st = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                st.append(ch);

            }else{
                st.reverse();
                ans += st;
                ans+=" ";
                st = new StringBuilder("");
            }
        }

        st.reverse();
        ans+=st;
        System.out.println(ans);

    }
}
