// Program to accept a number from user and and return squareroot of that number if squareroot is whole number

import java.util.*;

class squareroot
{
    public static int CalculateSquareroot(int iNo)
    {
        int i = 0;

        if (iNo < 0)
        {
            return -1;
        }

        for(i = 1; (i * i) <= iNo; i++)
        {
            if (iNo % i == 0)
            {
                if (i * i == iNo)
                {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number of which you want squareroot : ");
        iValue = sobj.nextInt();

        iRet = CalculateSquareroot(iValue);

        if (iRet == -1)
        {
            System.out.println("Squareroot of given number is not a whole number");
        }
        else
        {
            System.out.println("Squareroot of " + iValue + " is " + iRet);
        }

        sobj.close();
    }
}
