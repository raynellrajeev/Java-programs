import java.util.*;
public class exception
{
    void NumberFormatException(String s) throws NumberFormatException

    {
        int d = Integer.parseInt(s);
        System.out.println(d);
    }
    void checkAge(int age)
    {
        try
        {
            if (age<18)
            {
                throw new ArithmeticException("Age must be greater than 18");
                
            }
        }
        catch(ArithmeticException e)
        {
                System.out.println(e);
        }
    }
    
    void ArrayOutOfIndex()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of elements");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter the elements");
       for(int i=0;i<n;i++)
       {
        arr[i] = sc.nextInt();
       }
       try
       {
        arr[n+1]=100;
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
        System.out.println(e);
       }
       finally
       {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

       }
    }
}
class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        exception obj= new exception();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        obj.checkAge(age);
        obj.ArrayOutOfIndex();
        System.out.println("enter a string");
        String s = sc.next();
        try
        {
            obj.NumberFormatException(s);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        
    }
}