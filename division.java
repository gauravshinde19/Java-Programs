// Program to accept two numbers from user and perform division of that numbers

import java.util.*;

class division
{
    public static float Div(float fNo1, float fNo2)
    {
        if(fNo2 != 0.0)
        {
            float fAns = 0.0f;
            fAns = fNo1 / fNo2;
            return fAns;
        }
        else
        {
            return -1;
        }
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        float fNo1 = 0.0f;
        float fNo2 = 0.0f;
        float fRet = 0.0f;

        System.out.println("Enter the first number :");
        fNo1 = sobj.nextFloat();

        System.out.println("Enter the second number :");
        fNo2 = sobj.nextFloat();

        fRet = Div(fNo1, fNo2);

        if(fRet != -1)
        {
            System.out.println("Division :\n" + fRet);
        }
        else
        {
            System.out.println("Second number should not be a 0");
        }
    }
}
