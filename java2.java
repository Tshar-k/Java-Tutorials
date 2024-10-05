import java.util.*;


public class java2 {
    public static void main(String[] args)
    {
    // If-else-else if----- conditions 
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>=18 && age<=60)
        // {
        //     System.out.println("Workign class");
        // }
        // else if(age<18)
        // {
        //     System.out.println("Study time");
        // }
        // else{
        //     System.out.println("Senior Citizen");
        // }

        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // if(number%2==1)
        // {
        //     System.out.println("Odd");
        // }
        // else{
        //     System.out.println("even");
        // }


        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a==b)
        // {
        //     System.out.println("equal");
        // }
        // else if(a>b)
        // {
        //     System.out.println("a > b");
        // }
        // else{
        //     System.out.println("a < b");
        // }

//-------------------------------------
// Switch-Case
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("one");
                // break;2
            case 2:
                System.out.println("two");
                // break;
            case 3:
                System.out.println("three");
                // break;
            default:
                System.out.println("Other number");
                // break;
        }
        sc.close();
    }
}
