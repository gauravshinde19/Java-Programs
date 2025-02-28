// Program to accept a N number of students from user and their marks in three subjects and calculate percentage

import java.util.*;

class Student
{
    int Roll_No;
    String sName;
    int English_Marks;
    int Hindi_Marks;
    int Marathi_Marks;

    public Student(int rn, String sn, int em, int hm, int mm)
    {
        Roll_No = rn;
        sName = sn;
        English_Marks = em;
        Hindi_Marks = hm;
        Marathi_Marks = mm;
    }

    public void Per(int max)
    {
        int iSum = 0;
        float fPer = 0.0f;

        iSum = English_Marks + Hindi_Marks + Marathi_Marks;

        fPer = ((float) iSum / max) * 100;
        System.out.printf("\nPercentage: %.2f%%\n", fPer);
    }
}

class Percentage
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;
        int i = 0;

        System.out.println("Enter the number of students:");
        iSize = sobj.nextInt();

        for (i = 0; i < iSize; i++)
        {
            sobj.nextLine(); 

            System.out.println("\nEnter the roll number:");
            int iRollN = sobj.nextInt();

            sobj.nextLine(); 

            System.out.println("Enter the name of Student:");
            String sStName = sobj.nextLine();

            System.out.println("Enter the obtain marks of English:");
            int iMarksE = sobj.nextInt();

            System.out.println("Enter the obtain marks of Hindi:");
            int iMarksH = sobj.nextInt();

            System.out.println("Enter the obtain marks of Marathi:");
            int iMarksM = sobj.nextInt();

            System.out.println("Enter the total of maximum marks including all subjects:");
            int iMax = sobj.nextInt();

            Student stobj = new Student(iRollN, sStName, iMarksE, iMarksH, iMarksM);
            stobj.Per(iMax);
        }

        sobj.close();
    }
}
