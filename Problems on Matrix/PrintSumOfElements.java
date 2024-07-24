// Program to accept number of rows and columns from user accept that much elements from user and display Matrix and sum of all the elements from that matrix

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

        System.out.println("Elements from the matrix :");
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int Summation()
    {
        int iSum = 0;
        int i = 0, j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                iSum = iSum + Arr[i][j]; 
            }
        }

        return iSum;
    }
}

class PrintSumOfElements
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
        mobj.Display();
        
        int iRet = 0;
        iRet = mobj.Summation();

        System.out.println("Summation : " + iRet);

        sobj.close();
    }
}
