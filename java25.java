import java.util.*;
public class java25 {
    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            int x = sc.nextInt();
            arr.add(x);
        }

        int count = 0;

        for(int i=0;i<size;i++)
        {
            if(arr.get(i)>5)
            {
                count++;
            }

        }

        System.out.println(count);
        sc.close();


    }
}
