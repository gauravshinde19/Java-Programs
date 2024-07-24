/*
    Program to accept number of rows and columns from user accept that much elements from user and swap matrix rows
    
    Original Matrix :
    78  56  34  98
    67  89  43  21  
    43  67  98  55
    56  34  76  10

    Matrix after swapping :
    67  89  43  21  
    78  56  34  98
    56  34  76  10
    43  67  98  55
*/

import java.util.*;

class Matrix
{
public int iRow;
public int iCol;
public int Arr[][];

    public Matrix(int A, int B)
    {
        this.iRow = A;
        this.iCol = B;
        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0, j = 0;

        System.out.println("Please enter the data : ");
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        int i = 0;
        int j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void SwapRow()
    {
        int i = 0, j = 0;
        int temp = 0;

        for(i = 0; i < iRow-1; i= i+2)
        {
            for(j = 0; j < iCol; j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i+1][j];
                Arr[i+1][j] = temp;
            }
        }
    }
}

class SwapRows
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int No1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        int No2 = sobj.nextInt();

        Matrix mobj = new Matrix(No1, No2);

        mobj.Accept();
        System.out.println("Original Matrix :");
        mobj.Display();

        mobj.SwapRow();
        System.out.println("Matrix after swapping :");
        mobj.Display();

        mobj = null;

        sobj.close();
    }
}
