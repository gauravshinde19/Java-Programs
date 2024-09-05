/*
    Program to accept a number from user and return the minimum digit from that number
*/

import java.util.*;

class FindMinDigit
{
    public static int MinDigit(int iNo)
    {
        int iMin = 9;
        int iDigit = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if (iDigit < iMin)
            {
                iMin = iDigit;
            }
            iNo = iNo / 10;
        }

        return iMin;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        iRet = MinDigit(iValue);

        System.out.println(iRet + " is the minimum digit from the number " + iValue);

        sobj.close();
    }
}
