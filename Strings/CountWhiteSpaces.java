/*
    Program to accept string from user and return count of white spaces in that string
*/

import java.util.*;

class Strings
{
    public static int CountWhiteSpaces(String str)
    {
        int iCount = 0;
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class CountWhiteSpaces
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        int iRet = 0;
        iRet = Strings.CountWhiteSpaces(str);
        System.out.println("Number of white spaces : " + iRet);

        sobj.close();
    }
}
