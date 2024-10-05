public class java14 {
    public static void main(String[] args)
    {
        // GET BIT 
        // int pos = 1;
        // int n = 5;
        // int bitmask = 1;
        // bitmask = bitmask<<pos;
        // if((n & bitmask) == 0)
        // {
        //     System.out.println("Bit at position " + pos + " = " + 0);
        // }
        // else{
        //     System.out.println("Bit at position " + pos + " = " + 1);
        // }

        // SET BIT
        // int pos =1;
        // int n = 5;
        // int bitmask = 1<<pos;

        // System.out.println(bitmask | n );

        // Clear Bit
        // int pos = 2;
        // int n = 5;
        // int bitmask = 1<<pos;
        // System.out.println(~bitmask & n);

        // Update BIT

        int pos = 3;
        int n = 5;
        int bitmask = 1<<pos;
        int x = 1;
        int result = 0;
        if(x == 0)
        {
           result = ~bitmask & n; 
        }
        else{
            result = bitmask | n;
        }

        System.out.println(result);

        

    }
}
