import java.nio.CharBuffer;

public class Buffer {
    public static void main(String[] args) {
        CharBuffer c = CharBuffer.allocate(10);

        String str ="hello";

        for(int i=0;i<str.length();i++)
        {
            char ci = str.charAt(i);
            c.put(ci);
        }
        int pos = c.position();
        System.out.println(pos);

        //sets the position to 0
        c.flip();

        while (c.hasRemaining())
        {
            System.out.println(c.get());
        }
    }
}
