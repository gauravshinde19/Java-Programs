/*
    Program to accept a number from user and check whether that number is prime or not
*/

import java.util.*;

class CheckPrime
{
    public static boolean CheckPrimeNumber(int No)
    {
        int i = 0;

        for(i = 2; i < (No/2); i++)
        {
            if (No % i == 0)
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String Arg[])
    {
        boolean bValue = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number which you want to check:");
        int iNo = sobj.nextInt();

        bValue = CheckPrimeNumber(iNo);

        if (bValue == true)
        {
            System.out.println(iNo + " is a prime number");
        }
        else
        {
            System.out.println(iNo + " is not a prime number");
        }

        sobj.close();
    }
}
