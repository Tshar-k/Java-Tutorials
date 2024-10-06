import java.util.*;
// Merge Sort


public class java21 {

    public static void conquer(int arr[],int s,int e)
    {
        int mid = s + (e-s)/2;

        int l1 = mid - s + 1;
        int l2 = e - mid;

        int[] first = new int[l1];
        int[] second = new int[l2];

        int k = s;
        for(int i=0;i<l1;i++)
        {
            first[i] = arr[k++];
        }

        k = mid +1;
        for(int i=0;i<l2;i++)
        {
            second[i] = arr[k++];
        }

        int index1 = 0;
        int index2 = 0;
        k = s;
        while(index1 < l1 && index2 < l2)
        {
            if(first[index1]<=second[index2])
            {
                arr[k] = first[index1];
                k++;
                index1++;
                
            }
            
            else
            {
                arr[k] = second[index2];
                k++;
                index2++;
            }
        }

        while(index1<l1)
    {
        arr[k] = first[index1];
        k++;
        index1++;
    }
    
    while(index2<l2)
    {
        arr[k] = second[index2];
        k++;
        index2++;
    }


    }

    public static void divide(int arr[], int s, int e)
    {
        if(s>=e)
        {
            return;
        }
        int mid = s + (e-s)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);

        conquer(arr,s,e);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        divide(arr,0,n-1);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
