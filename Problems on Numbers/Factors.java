/*
    Program to accept a number from user and display all the factors of that number
*/

import java.util.*;

class Factors
{
    public static void FindFactors(int No)
    {
        System.out.println("Factors of " + No + ":");
        for(int i = 1; i <= No/2; i++)
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

        System.out.println("Enter the number of which you want to find factors:");
        int iNo = sobj.nextInt();

        FindFactors(iNo);

        sobj.close();
    }
}
