public class java16 {

    static void print(int n)
    {
        if(n==0)
        {
            return;
        }

        print(n-1);
        System.out.println(n);
    }

    static int power(int x,int n)
    {
        if(n == 0)
        {
            return 1;
        }
        if(x == 0)
        {
            return 1;
        }

        if(n%2==0)
        {
            return power(x,n/2)*power(x,n/2);
        }
        else{
            return power(x,n/2)*power(x,n/2)*x;
        }

    }

    public static void main(String[] args) {
        // print(5);
        System.out.println(power(2,4));
    }
}
