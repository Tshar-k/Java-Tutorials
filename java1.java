import java.util.*;

public class java1 {
    public static void main(String[] args) {
        // print and println and \n
        // System.out.print("Hello World with java\n");
        // System.out.print("Hello World with java");
// -----------------
        // System.out.print("*\n**\n***\n****");

//------------------
        //variable and constant
        // int a = 25;
        // int b = 50;
        // System.out.println("Original");
        // System.out.println(a);
        // System.out.println(b);
        // a = a+b;
        // b = a-b;
        // a = a-b;
        // System.out.println("Swapped");
        // System.out.println(a);
        // System.out.print(b);
//---------------data types

// byte, short, char, boolean, int, long, float, double = Primitive 

        // int a = 10;
        // int b = 20;
        // int sum = a+b;
        // int diff = a-b;
        // int mul = a*b;
        // System.out.println(diff);
        // System.out.println(sum);
        // System.out.println(mul);
        
//-------------------------

        // Scanner sc = new Scanner(System.in);    // sc is an object
        // // String name = sc.next();               // sc.next is member function
        // // String name = sc.nextLine();
        // int a = sc.nextInt();
        // float b = sc.nextFloat();
        // double c = sc.nextDouble();
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);


//-----------------------------

        // Take 2 variable as input and add them
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);


        sc.close();

    }
}
