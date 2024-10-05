import java.util.*;

public class hashmaptutorial {
    public static void main(String[] args) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(1, 120);
        // map.put(2, 240);
        // map.put(3, 360);  // Corrected here with a value

        // System.out.println(map);

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<size;i++){
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

        sc.close();

    }
}
