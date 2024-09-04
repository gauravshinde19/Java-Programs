/*
    Program to accept a number from user and perform the sum of all odd digits
*/

import java.util.*;

class DigitsSummationOdd
{
    public static int OddDigitsSum(int iNo)
    {
        int iSumOdd = 0;
        int iDigit = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if ((iDigit % 2) != 0)
            {
                iSumOdd = iSumOdd + iDigit;
            }
            iNo = iNo / 10;
        }

        return iSumOdd;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        iRet = OddDigitsSum(iValue);

        System.out.println("Sum of odd digits is " + iRet);

        sobj.close();
    }
}
