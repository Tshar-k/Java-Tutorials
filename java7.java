public class java7 {

    public static int avg(int a,int b,int c)
    {
        return (a+b+c)/3;
    }

    public static int sumofodd(int n)
    {
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            if(i%2==1)
            {
                sum+=i;
            }
        }

        return sum;
    }

    public static int greater(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }

    public static double circum(int radius)
    {
        return 3.14*radius*radius;
    }




    public static void main(String[] args)
    {
        // System.out.println(avg(10,20,30));
        // System.out.println(sumofodd(100));
        // System.out.println(greater(100,20));
       
    }
}
