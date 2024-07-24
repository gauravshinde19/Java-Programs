/*
    Program to accept string from user and replace the string or character
*/

import java.util.*;

class Strings
{
    public static void ReplaceString(String str, String s1, String s2)
    {
        str = str.replaceAll(s1, s2);
        System.out.println("String after replacement : " + str);
    }
}

class ReplaceString
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        System.out.println("Enter the string you want to replace : ");
        String rep1 = sobj.nextLine();

        System.out.println("Enter the string you want to replace with : ");
        String rep2 = sobj.nextLine();

        Strings.ReplaceString(str, rep1, rep2);

        sobj.close();
    }
}
