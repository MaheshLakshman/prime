class Prime 
{
    public static void main(String args[])
    {
        byte limit = 100;
        System.out.println("The numbers are :");
        for(int i = 1; i <= limit; i++)
        {
            int num = findPrime(i);
            if(num > 1)
            {
                System.out.println(num);
            }
        }
    }

    public static int findPrime(int number)
    {
        boolean flag = false;
        int num = number / 2;
        for(int i = 2; i <= num; i++)
        {
            if(number % i == 0)
            {
                flag = true;
                break;
            }
        }
        return flag ? 0 : number;
    }
}