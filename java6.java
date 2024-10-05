public class java6 {
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }

        return n*fact(n-1);

    }

    public static int sum(int a, int b)
    {
        return a+b;
    }

    public static int mul(int a, int b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
        // sixth obj = new sixth();   //create instance of class sixth
        System.out.println(fact(6));
        System.out.println(sum(6,10));
        System.out.println(mul(10,20));
    }
}
