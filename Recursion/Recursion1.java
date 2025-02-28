// Program to accept a number from user and print next 10 numbers from that number using recursion

import java.util.*;

class Recursion
{
    public static void Display(int iNo, int iCount)
    {
        if (iCount != 10)
        {
            System.out.println(++iNo);
            iCount++;
            Display(iNo, iCount);
        }
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        System.out.println("Numbers:");
        Display(iValue, 0);
    }
}
