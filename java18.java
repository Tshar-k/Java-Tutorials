// import java.util.*;
public class java18{

    // public static void perumtationstr(String str, String per)
    // {
    //     if(str.length() == 0)
    //     {
    //         System.out.println(per);
    //         return;
    //     }


    //     for(int i=0;i<str.length();i++)
    //     {
    //         char currChar = str.charAt(i);
    //         String newstr = str.substring(0, i) + str.substring(i+1);
    //         perumtationstr(newstr, per+currChar);

    //     }
    // }

    // public static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    // static ArrayList<ArrayList<Integer>> per(ArrayList<Integer> nums, int idx)
    // {
    //        if(idx==nums.size())
    //        {
    //          result.add(new ArrayList<>(nums));
    //          return result;
    //        }


    //        for(int i=idx;i<nums.size();i++)
    //        {
    //         int temp1 = nums.get(i);
    //         nums.set(i, nums.get(idx));
    //         nums.set(idx, temp1);

    //             per(nums,idx+1);

    //             int temp2 = nums.get(i);
    //             nums.set(i, nums.get(idx));
    //             nums.set(idx, temp2);
    //        }
    //        return result;
    // }

    static int paths(int n,int m,int i,int j)
    {
        if(i==n || j ==m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        // move downwards
        int downpaths = paths(n,m,i+1,j);

        // move right
        int rightpaths = paths(n,m,i,j+1);

        return downpaths+rightpaths;
    }
    
    public static void main(String[] args) {
        int x = paths(3,3,0,0);
        System.out.println(x);
    }
}