// Program to accept a dividend and divisor from user and return remainder

import java.util.*;

class remainder
{
    public static int CalculateRemainder(int Dividend, int Divisor)
    {
        int rem = 0;
        rem = Dividend % Divisor;
        return rem;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;
        int iValue2 = 0;
        int iRet = 0;

        System.out.println("Enter the dividend : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the divisor : ");
        iValue2 = sobj.nextInt();

        try
        {
            iRet = CalculateRemainder(iValue1, iValue2);        
            System.out.println("Remainder is " + iRet);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divisor cannot be 0");
        }
        
        sobj.close();
    }
}
