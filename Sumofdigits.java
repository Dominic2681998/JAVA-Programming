class Sumofdigits
{
    int sum(int n)
    {
        int sum=0,k; 
        while(n>0 || sum>9)
        {
            if(n==0) 
            {
                n=sum;
                sum=0;
            }
            k=n%10;
            sum+=k;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Sumofdigits s=new Sumofdigits();
        int n=124;
        System.out.println("Sum of digits:"+s.sum(n));
    }
}