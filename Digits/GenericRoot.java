/*
    Program to accept number from user and find its generic root (Performing sum of digits till sum is single digit)

    Input :
    6628
    Output :
    4
 */

import java.util.*;

class GenericRoot
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int iSum = 0;
        int iDigit = 0;
        int iTemp = 0;

        iTemp = iNo;
        while(iNo >= 10)
        {
            while(iNo != 0)
            {
                iDigit = iNo % 10;
                iSum = iSum + iDigit;
                iNo = iNo / 10;
            }
            iNo = iSum;
            if(iSum >= 10)
            {
                iSum = 0;
            }
        }

        System.out.println("Generic Root of " + iTemp + " is " + iSum);

        sobj.close();
    }
}
