// Program to accept a array from user and return the largest element from array

import java.util.*;

class LargestArrayElement
{
    public static int LargestElement(int Arr[])
    {
        int i = 0;
        int iMax = Arr[0];

        for(i = 0; i < Arr.length; i++)
        {
            if (iMax < Arr[i])
            {
                iMax = Arr[i];
            }
        }

        return iMax;
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
        
        iRet = LargestElement(arr);

        System.out.println("Largest element from array is " + iRet);
    }
}
