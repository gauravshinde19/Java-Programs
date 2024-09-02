/*
    Program to accept a number and range from user and display all the factors of that number between that given range
*/

import java.util.*;

class FactorsBetweenRange
{
    public static void DisplayFactors(int Fact, int iNo1, int iNo2)
    {
        int i = 0;

        if ((iNo1 <= 0) || (iNo2 > Fact))
        {
            System.out.println("Invalid Range");
        }
        else
        {
            System.out.println("Factors of " + Fact + " between the range of " + iNo1 + " to " + iNo2 + ":");
            for(i = iNo1; i <= iNo2; i++)
            {
                if (Fact % i == 0)
                {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of which you want to find factors:");
        int iFact = sobj.nextInt();
        System.out.println("Enter the starting number of range:");
        int iValue1 = sobj.nextInt();
        System.out.println("Enter the ending number of range:");
        int iValue2 = sobj.nextInt();

        DisplayFactors(iFact, iValue1, iValue2);

        sobj.close();
    }
}
