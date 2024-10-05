import java.util.*;
public class java17 {
    
    static void towerofhanio(int n, String src, String help, String des )
    {
        if(n==1)
        {
            System.out.println("transfer disk " + n + " from " + src + " to " + des);
            return;
        }
        towerofhanio(n-1, src, des, help);
        System.out.println("transfer disk " + n + " from " + src + " to " + des);
        towerofhanio(n-1, help, src, des);
    }

    static void revstring(String s, int n)
    {
        if(n<0)
        {
            return;
        }

        System.out.print(s.charAt(n));
        revstring(s, n-1);
        

    }

    static int first = -1;
    static int last = -1;

    static ArrayList<Integer>  occ(String s, int n, ArrayList<Integer> ans,int i,char element)
    {
        if(i>n-1)
        {
            ans.add(first);
            ans.add(last);
            return ans;
        }
       
        if(s.charAt(i) == element)
        {
            if(first == -1)
            {
                first = i;
            }
            last = i;
        }

        return occ(s,n,ans,i+1,element);

    }

    static boolean issorted(int[] arr,int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }

        if(arr[i]>arr[i+1])
        {
            return false;
        }

        return issorted(arr, i+1);
    }


    static void xatend(String s,int i,int count,String ans)
    {
        if(i==s.length())
        {
            for(int j=0;j<count;j++)
            {
                ans+='x';
            }
            System.out.println(ans);
            return;
        }
       char currChar = s.charAt(i);
       if(currChar == 'x')
       {
        count++;
        xatend(s, i+1, count, ans);
       }
       else{
        ans += currChar;
        xatend(s, i+1, count, ans);
       }
    }


    static ArrayList<String> powerset(String s, int i,ArrayList<String>ans,String temp)
    {
        if(i==s.length() )
        {
            ans.add(temp);
            return ans;
   
        }

        powerset(s,i+1,ans,temp+s.charAt(i));
        powerset(s,i+1,ans,temp);
        return ans;
    } 

    public static HashSet<String> result = new HashSet<>();
    static ArrayList<String> unique(String s, int i,ArrayList<String>ans,String temp)
    {
        if(i==s.length())
        {
            if (!result.contains(temp)) {  
                ans.add(temp);             
                result.add(temp);          
            }
                return ans;
   
        }

        unique(s,i+1,ans,temp+s.charAt(i));
        unique(s,i+1,ans,temp);
        return ans;
    } 

    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};
    static void keypadprint(String number,int i, String res)
    {
        if(i == number.length())
        {
            System.out.println(res);
            return;
        }

        for(int j=0;j<keypad[number.charAt(i)-'0'].length();j++)
        {
            char curr = keypad[number.charAt(i)-'0'].charAt(j);
            keypadprint(number,i+1,res+curr);
        }
    }


    public static void main(String[] args)
    {
        String number = "23";
        keypadprint(number, 0, "");
    }
}
