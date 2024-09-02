/*
    Program to accept a number from user and display the table of that number
*/

import java.util.*;

class Table
{
    public static void FindTable(int iNo)
    {
        int i = 0;

        System.out.println("Table of " + iNo + ":");
        for(i = 1; i <=10; i++)
        {
            System.out.println(iNo * i);
        }
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of which you want to display table:");
        int iValue = sobj.nextInt();

        FindTable(iValue);

        sobj.close();
    }
}
