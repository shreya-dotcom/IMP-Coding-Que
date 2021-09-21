import java.util.*;

public class BinarySearch {
    int binarySearchRec(int arr[],int l, int r,int x)
    {

       if(r>=l)
       {
           int mid = l+(r-l)/2;
           if(arr[mid] == x)
           {
               return mid;
           }

           if (arr[mid]>x)
           {
               return binarySearchRec(arr,l,mid-1,x);
           }
           return binarySearchRec(arr,mid+1,r,x);
       }
       return -1;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //binary search
        //input array length and array elements
        //array - sorted
        System.out.println("Enter number of elements :");
        int n = sc.nextInt();

        int arr[] =new int[n];
        System.out.println("Enter elements of an array :");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to be search :");
        int val = sc.nextInt();

        BinarySearch b = new BinarySearch();

        int res = b.binarySearchRec(arr,0,n-1,val);
//        System.out.println(res);
        if(res==-1)
        {
            System.out.println("Element is not present");
        }
        else
        {
            System.out.println("Element  is present at index "+res);
        }

    }

}
