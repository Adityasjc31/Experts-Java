class Palindrome
{
    public static boolean isPalindrome(int n)
    {
        int rev=0;
        for(int x=n ; x!=0 ; x=x/10)
        {
            int d=x%10;
            rev=rev*10+d;
        }
        return n==rev;
    }
}