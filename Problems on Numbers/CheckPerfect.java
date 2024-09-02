/*
    Program to accept a number from user and check whether that number is perfect or not
*/

import java.util.*;

class CheckPerfect
{
    public static boolean CheckPerfectNumber(int No)
    {
        int i = 0;
        int iSum = 0;

        for(i = 1; i <= (No / 2); i++)
        {
            if (No % i == 0)
            {
                iSum = iSum + i;
            }
        }
        if (iSum == No)
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

        System.out.println("Enter the number which you want to check:");
        int iNo = sobj.nextInt();

        bValue = CheckPerfectNumber(iNo);

        if (bValue == true)
        {
            System.out.println(iNo + " is a perfect number");
        }
        else
        {
            System.out.println(iNo + " is not a perfect number");
        }

        sobj.close();
    }
}
