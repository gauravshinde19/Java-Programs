/*
    Program to accept a number of rows and columns from user and display below pattern
    Input: rows & columns - 4
    Pattern:
    1
    1  2
    1  2  3
    1  2  3  4
*/

import java.util.*;

class PatternNumber3
{
    public static void Display(int rows, int cols)
    {
        int i = 0;
        int j = 0;

        System.out.println("Pattern:");
        for(i = 1; i <= rows; i++)
        {
            for(j = 1; j <= cols; j++)
            {
                if (i >= j)
                {
                    System.out.print(j + "  ");
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

        if (iRows == iCols)
        {
            Display(iRows, iCols);    
        }
        else
        {
            System.out.println("Error: Number of rows and columns are not equal");
        }

        sobj.close();
    }
}
