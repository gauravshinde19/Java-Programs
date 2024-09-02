/*
    Program to accept a number from user and display all the even factors of that number
*/

import java.util.*;

class FactorsEven
{
    public static void FindEvenFactors(int No)
    {
        int i = 0;

        System.out.println("Even Factors of " + No + ":");
        for(i = 2; i <= No/2; i+=2)
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

        System.out.println("Enter the number of which you want to find even factors:");
        int iNo = sobj.nextInt();

        FindEvenFactors(iNo);

        sobj.close();
    }
}
