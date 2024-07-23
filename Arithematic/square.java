// Program to accept a number from user and and return square of that number

import java.util.*;

class square
{
    public static int Sqr(int iNo)
    {
        int iAns = 0;
        iAns = iNo * iNo;
        return iAns;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number of which you want square : ");
        iValue = sobj.nextInt();

        iRet = Sqr(iValue);
        System.out.println("Square of " + iValue + " is " + iRet);
    }
}
