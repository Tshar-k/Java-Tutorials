import java.util.*;
public class java15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }


        // Bubble Sort

        // for(int i=0;i<size-1;i++)
        // {
        //     for(int j=0;j<size-1-i;j++)
        //     {
        //         if(arr[j]>arr[j+1])
        //         {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
               
        //     }
        // }


        // Selection Sort
        // for(int i=0;i<size-1;i++)
        // {
        //     int minindex = i;
        //     for(int j=i+1;j<size;j++)
        //     {
        //         if(arr[j]<arr[minindex])
        //         {
        //             minindex = j;
        //         }
        //     }
        //     int temp = arr[minindex];
        //     arr[minindex] =  arr[i];
        //     arr[i] = temp;
        // }

        // Insertion Sort

        // for(int i=1;i<size;i++)
        // {
        //     int j = i;
        //     while(j>0)
        //     {
        //         if(arr[j-1]>arr[j])
        //         {
        //             int temp = arr[j-1];
        //         arr[j-1] = arr[j];
        //         arr[j] = temp;
        //         }
        //         j--;
        //     }
        // }

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}