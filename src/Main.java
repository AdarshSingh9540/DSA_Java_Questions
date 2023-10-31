package StringBuffer;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sb2 = new StringBuffer("Adarsh singh 2");


        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());
        // by default capacity is 16


        sb.append("AdarshSingh");
        sb.append(" is nice ! ");

        sb.insert(1,"a");
        sb.replace(15 , 19 ," awesome");
        sb.delete(1,2);

        sb.reverse();
        sb.reverse();

        String str = sb.toString();

        System.out.println(str);

        Random random = new Random();
        System.out.println(random.nextFloat());

        System.out.println((char)(97+2));

        int n=20;
        String name = RandomString.generate(n);

        System.out.println(name);


        String sentence = "hi   ada    afyf ajiuh ";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s",""));

    }
}
