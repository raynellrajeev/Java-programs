import java.util.*;
class employee 
{
    String name, address;
    int age,salary;
    long phno;

    employee(String name, String address, int age, int salary,long phno)
    {
        this.name = name;
        this.age = age;
        this.phno= phno;
        this.salary=salary;
        this.address=address;

    }

    void printsalary()
    {
        System.out.println("\n"+salary);
    }
}

class officer extends employee
{
    String specialization;
    
    officer(String name, String address, int age, int salary, long phno,String spcl) 
    {
        super(name, address, age, salary, phno);
        specialization = spcl;
    }

    void displayofficer()
    {
        System.out.println("officer\n");
        System.out.println("name\n"+super.name);
        System.out.println("age\n"+super.age);
        System.out.println("phno\n"+super.phno);
        System.out.println("address\n"+super.address);
        super.printsalary();
        System.out.println("specialization\n"+specialization);
    }   
}

class manager extends employee
{
    String department;
    
    manager(String name, String address, int age, int salary, long phno,String dept) 
    {
        super(name, address, age, salary, phno);
        department = dept;
    }

    void displaymanager()
    {
        System.out.println("manager\n");
        System.out.println("name\n"+super.name);
        System.out.println("age\n"+super.age);
        System.out.println("phno\n"+super.phno);
        System.out.println("address\n"+super.address);
        super.printsalary();
        System.out.println("department\n"+department);
    }   
}

class demo
{
    public static void main(String[] args)
    {
        String name,address,spcl,dept;
        int salary,age;
        long phno;

        Scanner sc= new Scanner(System.in);
        System.out.println("enter manager details");

        System.out.println("enter name");
        name=sc.nextLine();
        System.out.println("enter address");
        address=sc.nextLine();
        System.out.println("enter dept");
        dept=sc.nextLine();
        System.out.println("enter salary");
        salary=sc.nextInt();
        System.out.println("enter age");
        age=sc.nextInt();
        System.out.println("enter phno");
        phno=sc.nextLong();
        manager obj2= new manager(name, address, age, salary, phno, dept);

        sc.nextLine();

        System.out.println("enter officer details");

        System.out.println("enter name");
        name=sc.nextLine();
        System.out.println("enter address");
        address=sc.nextLine();
        System.out.println("enter spcl");
        spcl=sc.nextLine();
        System.out.println("enter salary");
        salary=sc.nextInt();
        System.out.println("enter age");
        age=sc.nextInt();
        System.out.println("enter phno");
        phno=sc.nextLong();
        officer obj1= new officer(name, address, age, salary, phno, spcl);

        obj1.displayofficer();
        obj2.displaymanager();


    }
}