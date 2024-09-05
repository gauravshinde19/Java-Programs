/*
    Program to accept a number from user and return the maximum digit from that number
*/

import java.util.*;

class FindMaxDigit
{
    public static int MaxDigit(int iNo)
    {
        int iMax = 0;
        int iDigit = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if (iDigit > iMax)
            {
                iMax = iDigit;
            }
            iNo = iNo / 10;
        }

        return iMax;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        iRet = MaxDigit(iValue);

        System.out.println(iRet + " is the maximum digit from the number " + iValue);

        sobj.close();
    }
}
