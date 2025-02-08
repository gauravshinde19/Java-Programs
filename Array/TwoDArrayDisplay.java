// Program to accept a two dimensional array from user and display

import java.util.*;

class TwoDArrayDisplay
{
    public static void Display(int ele[][], int rows, int cols)
    {
        int i = 0;
        int j = 0;

        System.out.println("Array elements in matrix form:");
        for(i = 0; i < rows; i++)
        {
            for(j = 0; j < cols; j++)
            {
                System.out.print(ele[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int iRow = 0;
        int iCol = 0;
        int i = 0;
        int j = 0;
        int arr[][];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows you want:");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of columns you want:");
        iCol = sobj.nextInt();

        arr = new int[iRow][iCol];

        System.out.println("Enter the elements of array:");
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        Display(arr, iRow, iCol);
    }
}
