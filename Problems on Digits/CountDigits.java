/*
    Program to accept a number from user and count all the digits from that number
*/

import java.util.*;

class CountDigits
{
    public static int Count(int iNo)
    {
        int iCount = 0;

        while (iNo != 0)
        {
            iCount++;
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

        iRet = Count(iValue);

        System.out.println("Number of Digits are " + iRet);

        sobj.close();
    }
}
