/*
    Program to accept a number from user and display all the digits of that number in reverse order
*/

import java.util.*;

class DisplayDigitsInReverse
{
    public static void DisplayReverse(int iNo)
    {
        int iDigit = 0;

        System.out.println("Digits in reverse order:");
        while (iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit);
            iNo = iNo / 10;
        }
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        DisplayReverse(iValue);

        sobj.close();
    }
}
