// Program to accept a number from user and and return cube of that number

import java.util.*;

class cube
{
    public static int CalculateCube(int iNo)
    {
        int iAns = 0;
        iAns = iNo * iNo * iNo;
        return iAns;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number of which you want cube : ");
        iValue = sobj.nextInt();

        iRet = CalculateCube(iValue);
        System.out.println("Cube of " + iValue + " is " + iRet);

        sobj.close();
    }
}
