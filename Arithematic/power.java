/*
    Program to accept a two numbers from user and display first number as power of second number
*/

import java.util.*;

class power
{
    public static int CalculatePower(int iNo1, int iNo2)
    {
        int iAns = 1;
        int i = 0;

        for(i = 1; i <= iNo2; i++)
        {
            iAns = iAns * iNo1;
        }

        return iAns;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int iValue1 = sobj.nextInt();
        System.out.println("Enter the second number:");
        int iValue2 = sobj.nextInt();

        int iRet = 0;
        iRet = CalculatePower(iValue1, iValue2);

        System.out.println(iValue1 + " raise to " + iValue2 + " is " + iRet);

        sobj.close();
    }
}
