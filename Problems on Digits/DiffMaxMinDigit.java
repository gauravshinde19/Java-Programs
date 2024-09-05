/*
    Program to accept a number from user and return the difference between maximum and minimum number
*/

import java.util.*;

class DiffMaxMinDigit
{
    public static int DiffMaxMin(int iNo)
    {
        int iMax = 0;
        int iMin = 9;
        int iDiff = 0;
        int iDigit = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if (iDigit > iMax)
            {
                iMax = iDigit;
            }
            if (iDigit < iMin)
            {
                iMin = iDigit;
            }
            iNo = iNo / 10;
        }

        iDiff = iMax - iMin;

        return iDiff;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        iRet = DiffMaxMin(iValue);

        System.out.println(iRet + " is the difference between Maximum and Minimum number from " + iValue);

        sobj.close();
    }
}
