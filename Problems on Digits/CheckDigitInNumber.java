/*
    Program to accept one number and one digit from user and check whether that number contains that digit or not
*/

import java.util.*;

class CheckDigitInNumber
{
    public static boolean CheckDigit(int iNo, int iDigit)
    {
        boolean bFlag = false;
        int iRem = 0;
        
        while (iNo != 0)
        {
            iRem = iNo % 10;
            if (iRem == iDigit)
            {
                bFlag = true;
            }
            iNo = iNo / 10;
        }

        return bFlag;
    }

    public static void main(String Arg[])
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number in which you want to check digit:");
        int iValue1 = sobj.nextInt();
        System.out.println("Enter the digit which you want to check:");
        int iValue2 = sobj.nextInt();

        bRet = CheckDigit(iValue1, iValue2);

        if (bRet == true)
        {
            System.out.println(iValue2 + " is present inside " + iValue1);
        }
        else
        {
            System.out.println(iValue2 + " is not present inside " + iValue1);
        }

        sobj.close();
    }
}
