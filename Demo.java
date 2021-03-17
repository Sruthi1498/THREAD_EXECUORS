import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo implements Runnable{
    String name;

    public Demo(String name)
    {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for(int i =0;i<4;i++)
            {
                if (i==0)
                {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for"+ " task name - "+ name +" = " +ft.format(d));

                }
                else
                {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - "+ name +" = " +ft.format(d));

                }
                Thread.sleep(1000);
            }
                System.out.println(name+ "complete");
        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }
    }
}
