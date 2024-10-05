import java.util.*;
public class java9 {
    public static void main(String[] args)
    {
        
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int[] arr = new int[size];

        // for(int i=0;i<size;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        // int n = size;
        // for(int i=0;i<size/2;i++)
        // {
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }

        // for(int i=0;i<size;i++)
        // {
        //     System.out.println(arr[i]);
        // }

        // sc.close();


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(element == arr[i])
            {
                System.out.println(i);
            }
        }
        sc.close();

    }
}
