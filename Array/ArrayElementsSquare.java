// Program to accept N numbers from user and display square of each number

import java.util.*;

class ArrayElementsSquare
{
    public static void DisplaySquare(int ele[], int iLength)
    {
        int i = 0;
        int iSquare = 0;

        System.out.println("Square of array elements:");
        for(i = 0; i < iLength; i++)
        {
            iSquare = ele[i] * ele[i];
            System.out.println(ele[i] + " = " + iSquare);
        }
    }

    public static void main(String[] args)
    {
        int iSize = 0;
        int i = 0;
        int arr[];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want:");
        iSize = sobj.nextInt();

        arr = new int[iSize];

        System.out.println("Enter the elements of array:");
        for(i = 0; i < iSize; i++)
        {
            arr[i] = sobj.nextInt();
        }

        DisplaySquare(arr, iSize);
    }
}
