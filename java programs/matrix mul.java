import java.util.*;
class matrixmul
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. of rows of first matrix");
        int row1= sc.nextInt();
        System.out.println("enter no. of column of first matrix");
        int column1= sc.nextInt();
        System.out.println("enter no. of rows of second matrix");
        int row2= sc.nextInt();
        System.out.println("enter no. of column of second matrix");
        int column2= sc.nextInt();
        
        if(column1==row2)
        {
            int a[][]= new int [row1][column1];
            int b[][]= new int [row2][column2];
            int c[][]= new int [row1][column2];
        
            System.out.println("elements of first matrix :");
            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<column1;j++)
                {
                    a[i][j]= sc.nextInt();
                }
            }
            System.out.println("elements of second matrix :");
            for (int i=0; i<row2; i++)
            {
                for(int j=0; j<column2;j++)
                {
                    b[i][j]= sc.nextInt();
                }
            }
            System.out.println("first matrix :");
            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<column1;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println(" ");
            }
            System.out.println("second matrix  :");
            for (int i=0; i<row2; i++)
            {
                for(int j=0; j<column2;j++)
                {
                    System.out.print(b[i][j]+ " ");
                }
                System.out.println(" ");
            }
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<column2;j++)
                {
                    for (int k=0;k< row2;k++)
                    {
                        c[i][j]= c[i][j] + a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("resultant matrix  :");
            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<column2;j++)
                {
                    System.out.print(c[i][j]+ " ");
                }
                System.out.println(" ");
            }
        
        
        }

    }
}
