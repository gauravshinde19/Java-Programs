/*
    Program to accept a number from user and display all the perfect numbers till that number
*/

import java.util.*;

class DisplayPerfect
{
    public static void DisplayPerfectNumber(int No)
    {
        int i = 0;
        int j = 0;
        int iSum = 0;

        System.out.println("Perfect numbers:");
        for(i = 1; i <= No; i++)
        {
            for(j = 1; j <= (i / 2); j++)
            {
                if (i % j == 0)
                {
                    iSum = iSum + j;
                }
            }
            if (iSum == i)
            {
                System.out.println(i);
            }
            iSum = 0;
        }
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number till you want to display:");
        int iNo = sobj.nextInt();

        DisplayPerfectNumber(iNo);

        sobj.close();
    }
}
