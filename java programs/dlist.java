import java.util.*;
class dlist
{
    static LinkedList<Integer> List;
    public static void main(String args[])
    {
        List= new LinkedList<Integer>();
        try (Scanner sc = new Scanner(System.in)) {
            while(true)
            {
                System.out.println("1.add 2.delete from front 3.delete from rear 4.delete at a position 5.display 6.exit");
                int ch = sc.nextInt();
                switch(ch)
                {
                    case 1:
                    {
                        System.out.println("Enter the element");
                        int ele=sc.nextInt();
                        List.add(ele);
                        display();
                        break;
                    }
                    case 2:
                    {
                        try
                        {
                            List.removeFirst();
                            display();
                        }
                        catch(Exception e)
                        {
                            System.out.println(e);
                        }
                        break;
                    }
                    case 3:
                    {
                        try
                        {
                            List.removeLast();
                            display();
                        }
                        catch(Exception e)
                        {
                            System.out.println(e);
                        }
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Enter the position");
                        int pos=sc.nextInt();
                        try
                        {
                            List.remove(pos-1);
                            display();
                        }
                        catch(Exception e)
                        {
                            System.out.println(e);
                        }
                        break;
                    }
                    case 5:
                    {
                        display();
                        break;
                    }
                    case 6:
                    {
                        System.exit(0);
                        break;
                    }
                }

            }
        }
    }
    static void display()
    {
        if(List.size()==0)
                    {
                        System.out.println("List is empty");
                        
                    }
                    else
                    {
                        Iterator<Integer> itr=List.iterator();
                        while(itr.hasNext())
                        {
                            System.out.println(itr.next());
                        }
                    }
    }
}