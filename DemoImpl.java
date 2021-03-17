import java.util.concurrent.*;

public class DemoImpl {
    public static void main(String[] args) {
        Runnable r1 = new Demo("thread 1");
        Runnable r2 = new Demo("thread 2");
        Runnable r3 = new Demo("thread 3");
        Runnable r4 = new Demo("thread 4");

        ExecutorService p = Executors.newFixedThreadPool(2);
        p.execute(r1);
        p.execute(r2);
        p.execute(r3);
        p.execute(r4);

        p.shutdown();
    }
}
