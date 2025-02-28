// Program to accept number from user and return addition of factors of that number using recursion

import java.util.*;

class Recursion3
{
    public static int FactorsSum(int iNo, int i, int sum)
    {
        if(i <= (iNo/2))
        {
            if ((iNo % i) == 0)
            {
                sum = sum + i;
            }

            i++;

            sum = FactorsSum(iNo, i, sum);
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        iValue = sobj.nextInt();

        iRet = FactorsSum(iValue, 1, 0);

        System.out.println("Summation of factors of " + iValue + ": " + iRet);

        sobj.close();
    }
}
