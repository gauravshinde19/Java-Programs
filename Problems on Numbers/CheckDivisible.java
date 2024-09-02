/*
    Program to accept two numbers from user and check whether first number is divisible by second number or not
*/

import java.util.*;

class CheckDivisible
{
    public static boolean Divisible(int iNo1, int iNo2)
    {
        if ((iNo1 % iNo2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String Arg[])
    {
        boolean bValue = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int iValue1 = sobj.nextInt();
        System.out.println("Enter the second number:");
        int iValue2 = sobj.nextInt();

        bValue = Divisible(iValue1, iValue2);

        if (bValue == true)
        {
            System.out.println(iValue1 + " is divisible by " + iValue2);
        }
        else
        {
            System.out.println(iValue1 + " is not divisible by " + iValue2);
        }

        sobj.close();
    }
}
