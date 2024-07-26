/*
    Program to accept string from user and print that string
*/

import java.util.*;

class Strings
{
    public static void Display(String str)
    {
        System.out.println("Entered string : " + str);
    }
}

class DisplayString
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        Strings.Display(str);

        sobj.close();
    }
}
