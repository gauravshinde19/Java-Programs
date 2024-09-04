/*
    Program to accept a number from user and count all the even digits from that number
*/

import java.util.*;

class CountEvenDigits
{
    public static int CountEven(int iNo)
    {
        int iCount = 0;
        int iDigit = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if ((iDigit % 2) == 0)
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

        iRet = CountEven(iValue);

        System.out.println("Number of even digits are " + iRet);

        sobj.close();
    }
}
