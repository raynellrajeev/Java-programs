import java.util.*;
class sum
{
    public static void main(String args[])
    {
        String s;
        int sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string of integers");
        s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens())
        {
            String key = st.nextToken();
            int k;
            try
            {
                k=Integer.parseInt(key);
                sum=sum+k;

            }
            catch(NumberFormatException e)
            {
                System.out.println("exception"+e);

            }
        }
        System.out.println("The sum is "+sum);

    }
}