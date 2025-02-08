/*
    Program to accept a number of rows and columns from user and display below pattern
    Input: rows & columns - 4
    Pattern:
    *  *  *  *
    *  *  *  *
    *  *  *  *
    *  *  *  *
*/

import java.util.*;

class PatternSquare
{
    public static void Display(int iNo)
    {
        int i = 0;
        int j = 0;

        System.out.println("Pattern:");
        for(i = 0; i < iNo; i++)
        {
            for(j = 0; j < iNo; j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int iRoco = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        iRoco = sobj.nextInt();

        Display(iRoco);

        sobj.close();
    }
}
