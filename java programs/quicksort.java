import java.util.*;
class quicksort 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array : ");
        for (int i = 0; i < n; i++)
        {
            
            arr[i] = sc.nextInt();

        }
        System.out.println("unsorted array : ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
             

        }
        quicksort obj= new quicksort();
        obj.sort(arr,0,n-1);
        System.out.println("sorted array : ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    public static int partition(int[] arr, int low, int high) 
    {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) 
        {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public void sort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(arr,low,high);
            sort(arr,low,pivot-1);
            sort(arr,pivot+1,high);
        }


    }
    
}