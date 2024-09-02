/*
    Program to accept a number and range from user and find all the prime numbers between that range
*/

import java.util.*;

class DisplayPrimeBetweenRange
{
    public static void PrimeNumbers(int No1, int No2)
    {
        int i = 0;
        int j = 0;
        boolean isPrime = true;

        System.out.println("Prime numbers betwwen the range of " + No1 + " to " + No2 + ":");
        for(i = No1; i <= No2; i++)
        {
            isPrime = true;
            for(j = 2; j <= (i / 2); j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the starting number of range:");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the ending number of range:");
        int iValue2 = sobj.nextInt();

        PrimeNumbers(iValue1, iValue2);

        sobj.close();
    }
}
