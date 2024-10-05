// import java.util.*;

public class java12 {
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // // System.out.println(sb.charAt(0));
        // // sb.setCharAt(1, 'p');  
        // // System.out.println(sb);

        // sb.insert(2,'n');
        // System.out.println(sb);

        StringBuilder sb = new StringBuilder("nama");
        StringBuilder org = new StringBuilder(sb);
        System.out.println(sb);
        for(int i=0;i<sb.length()/2;i++)
        {
            int front = i;
            int back = sb.length()-i-1;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);

        if(sb.compareTo(org) == 0)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

        // System.out.println(sb);


    }
}
