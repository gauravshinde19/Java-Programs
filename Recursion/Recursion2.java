// Program to accept a N numbers from array and display even elements from array using recursion

import java.util.*;

class Recursion2
{
    public static void EvenElements(int ele[], int iCount)
    {
        if (iCount != ele.length)
        {
            if (ele[iCount] % 2 == 0)
            {
                System.out.println(ele[iCount]);
            }
            iCount++;

            EvenElements(ele, iCount);
        }
    }
    public static void main(String[] args)
    {
        int arr[];
        int iSize = 0;
        int i = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want:");
        iSize = sobj.nextInt();

        arr = new int[iSize];

        System.out.println("Enter the elements of array:");
        for(i = 0; i < iSize; i++)
        {
            arr[i] = sobj.nextInt();
        }

        System.out.println("Even elements from array:");
        EvenElements(arr, 0);
    }
}
