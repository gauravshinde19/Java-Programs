/*
    Program to accept a number from user and find all the prime numbers till that number
*/

import java.util.*;

class DisplayPrime
{
    public static void PrimeNumbers(int No)
    {
        int i = 0;
        int j = 0;
        boolean isPrime = true;

        System.out.println("Prime numbers:");
        for(i = 2; i <= No; i++)
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
            if (i >= 3) // For better time comlexity
            {
                i++;
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the numebr till you want to display Prime numbers:");
        int iNo = sobj.nextInt();

        PrimeNumbers(iNo);

        sobj.close();
    }
}
