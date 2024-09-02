/*
    Program to accept a number from user and display all the odd factors of that number
*/

import java.util.*;

class FactorsOdd
{
    public static void FindOddFactors(int No)
    {
        int i = 0;

        System.out.println("Odd Factors of " + No + ":");
        for(i = 1; i <= No/2; i+=2)
        {
            if (No % i == 0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of which you want to find odd factors:");
        int iNo = sobj.nextInt();

        FindOddFactors(iNo);

        sobj.close();
    }
}
