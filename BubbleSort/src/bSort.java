import java.util.*;

public class bSort {

    static void bSorting(int arr[])
    {
        int n = arr.length;
        //need two indexes to compare 2 elements
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])    //if bigger element is  placed after smaller than  , swap for ascending sort
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //accept number of elements in an array
        System.out.println("Enter number of elements in an array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        //accept numbers
        System.out.println("Enter elements of an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        bSorting(arr);
        System.out.println("Sorted array is :");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
