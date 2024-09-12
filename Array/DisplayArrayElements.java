// Program to accept a array from user and display array elements

import java.util.*;

class DisplayArrayElements
{
    public static void Display(int Arr[])
    {
        int i = 0;

        System.out.println("Entered elements:");
        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public static void main(String Arg[])
    {
        int iSize = 0;
        int i = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        iSize = sobj.nextInt();

        int arr[] = new int[iSize];

        System.out.println("Enter the elements:");
        for(i = 0; i < iSize; i++)
        {
            arr[i] = sobj.nextInt();
        }
        
        Display(arr);
    }
}
