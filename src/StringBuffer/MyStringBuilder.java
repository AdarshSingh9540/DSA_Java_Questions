package StringBuffer;
public class MyStringBuilder {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);

        str.append(" World");
        str.setCharAt(0,'M');
        System.out.println(str);

    }
}
