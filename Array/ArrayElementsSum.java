// Program to accept a array from user and return sum of array elements

import java.util.*;

class ArrayElementsSum
{
    public static int Summation(int Arr[])
    {
        int i = 0;
        int iSum = 0;

        for(i = 0; i < Arr.length; i++)
        {
            iSum = iSum + Arr[i];
        }

        return iSum;
    }

    public static void main(String Arg[])
    {
        int iSize = 0;
        int i = 0;
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        iSize = sobj.nextInt();

        int arr[] = new int[iSize];

        System.out.println("Enter the elements:");
        for(i = 0; i < iSize; i++)
        {
            arr[i] = sobj.nextInt();
        }
        
        iRet = Summation(arr);

        System.out.println("Sum of array elements is " + iRet);
    }
}
