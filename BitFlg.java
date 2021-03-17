public class BitFlg {

    public int show(int data, int flags)
    {
        return flags|data;
    }
    public boolean print(int data, int flags)
    {
        return (flags^data) == flags;
    }

    public static void main(String[] args) {
        int flag = 10&2;

        System.out.println(flag);
        BitFlg b = new BitFlg();
        System.out.println(b.show(10, flag));
        System.out.println(b.print(3,flag));
    }
}
