/*
    Program to accept a number from user and perform the sum of all even digits
*/

import java.util.*;

class DigitsSummationEven
{
    public static int EvenDigitsSum(int iNo)
    {
        int iSumEven = 0;
        int iDigit = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if ((iDigit % 2) == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            iNo = iNo / 10;
        }

        return iSumEven;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        iRet = EvenDigitsSum(iValue);

        System.out.println("Sum of even digits is " + iRet);

        sobj.close();
    }
}
