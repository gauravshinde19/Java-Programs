/*
    Program to accept a number from user and count all the odd digits from that number
*/

import java.util.*;

class CountOddDigits
{
    public static int CountOdd(int iNo)
    {
        int iCount = 0;
        int iDigit = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if ((iDigit % 2) != 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }

        return iCount;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        iRet = CountOdd(iValue);

        System.out.println("Number of odd digits are " + iRet);

        sobj.close();
    }
}
