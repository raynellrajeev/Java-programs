import java.io.*;
class file
{
    public static void main(String[] args) throws IOException

    {
        FileInputStream f1=null;
        FileOutputStream f2=null;
        try
        {
            f1= new FileInputStream("file1.txt");
            f2 = new FileOutputStream("file2.txt");
            int c;
            do 
            {
                c=f1.read();
                if (c!=-1)
                {
                    System.out.println((char)c);
                    f2.write(c);
                }
            }while(c!=-1);



        }
        catch(Exception e)
        {
            System.out.println("Exception"+e);

        }
        finally
        {
            f1.close();
            f2.close();
        }
    }
}
