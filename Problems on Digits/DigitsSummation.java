/*
    Program to accept a number from user and perform the sum of all digits of that number
*/

import java.util.*;

class DigitsSummation
{
    public static int DigitsSum(int iNo)
    {
        int iSum = 0;

        while (iNo != 0)
        {
            iSum = iSum + (iNo % 10);
            iNo = iNo / 10;
        }

        return iSum;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        iRet = DigitsSum(iValue);

        System.out.println("Sum of Digits is " + iRet);

        sobj.close();
    }
}
