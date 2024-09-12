// Program to accept a array from user and return the smallest element from array

import java.util.*;

class SmallestArrayElement
{
    public static int SmallestElement(int Arr[])
    {
        int i = 0;
        int iMin = Arr[0];

        for(i = 0; i < Arr.length; i++)
        {
            if (iMin > Arr[i])
            {
                iMin = Arr[i];
            }
        }

        return iMin;
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
        
        iRet = SmallestElement(arr);

        System.out.println("Smallest element from array is " + iRet);
    }
}
