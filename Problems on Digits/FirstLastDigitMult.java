/*
    Program to accept a number from user and return the multiplication of first and last digit
*/

import java.util.*;

class FirstLastDigitMult
{
    public static int MultFirstLast(int iNo)
    {
        int iDigit = 0;
        int iMult = 1;
        int i = 0;
        int iFirst = 0;
        int iLast = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            i++;
            if (i == 1)
            {
                iLast = iDigit;
            }
            iNo = iNo / 10;
            iFirst = iDigit;
        }

        iMult = iFirst * iLast;
        return iMult;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        iRet = MultFirstLast(iValue);

        System.out.println("Multiplication of first and last digit is " + iRet);

        sobj.close();
    }
}
