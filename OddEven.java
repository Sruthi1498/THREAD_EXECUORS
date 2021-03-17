public class OddEven {
    public static boolean OddEvenXor(int num)
    {
        if((num^1) == num+1)
            return true;
        else
            return false;
    }
    public static boolean OddEvenAnd(int num)
    {
        return (num&1)==1;
    }

    public static boolean OddEvenOr(int num)
    {
        if((num|1)>num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(OddEvenXor(10)==true?"Even":"Odd");
        System.out.println(OddEvenAnd(10)==true?"Odd":"Even");
        System.out.println(OddEvenOr(10)==true?"Even":"Odd");
    }
}
