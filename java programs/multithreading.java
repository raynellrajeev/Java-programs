class example
{
    synchronized static void display()
    {
        Thread g= new Thread();
        for(int i=0;i<10;i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(g.getName()+" "+i);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class t extends Thread
{
    public void run()
    {
        example.display();
    }
}
class tsynch
{
    public static void main(String args[])
    {
        t t1= new t();
        t t2 = new t();
        t t3 = new t();
        t1.start();
        t2.start();
        t3.start();
    }
}