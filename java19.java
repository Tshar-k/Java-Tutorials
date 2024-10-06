public class java19{
    public static void printpermutation(String str, String prem, int idx)
    {
        if(str.length() == 0)
        {
            System.out.println(prem);
        }
        for(int i=0;i<str.length();i++)
        {
            char currChar = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            printpermutation(newstr, prem+currChar, idx+1);
        }
    }

    public static void main(String[] args) {
        printpermutation("ABC", "", 0);
    }
}