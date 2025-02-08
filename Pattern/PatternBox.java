/*
    Program to accept a number of rows and columns from user and display below pattern
    Input: rows - 4, columns - 5
    Pattern:
    *  *  *  *  *
    *           *
    *           *
    *  *  *  *  *
*/

import java.util.*;

class PatternBox
{
    public static void Display(int rows, int cols)
    {
        int i = 0;
        int j = 0;

        System.out.println("Pattern:");
        for(i = 0; i < rows; i++)
        {
            for(j = 0; j < cols; j++)
            {
               if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1)
               {
                    System.out.print("*  ");
               }
               else
               {
                    System.out.print("   ");
               }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int iRows = 0;
        int iCols = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        iRows = sobj.nextInt();

        System.out.println("Enter the number of columns:");
        iCols = sobj.nextInt();

        Display(iRows, iCols);

        sobj.close();
    }
}