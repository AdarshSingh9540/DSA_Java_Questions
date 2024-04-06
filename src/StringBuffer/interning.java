package StringBuffer;

public class interning {
    public static void main(String[] args) {
        String str = "Hello";
        String st = "Hello";

        str = "Hi";
        System.out.println(st);
    }
}
// Hence String are immutable in java
