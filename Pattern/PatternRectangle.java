/*
    Program to accept a number of rows and columns from user and display below pattern
    Input: rows - 3, columns - 4
    Pattern:
    *  *  *  *
    *  *  *  *
    *  *  *  *
*/

import java.util.*;

class PatternRectangle
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
                System.out.print("*  ");
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