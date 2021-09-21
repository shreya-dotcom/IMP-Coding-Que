import java.util.*;
public class BinarySearch {


    //req for binary search - low , high , mid
    public static int binaryIterative(int arr[],int val)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        //if arr[mid] == val , return mid
        mid = low+(high-low)/2;
        while(low<=high)
        {
            if(arr[mid] ==val)
            {
                return mid;
            }
            else if(arr[mid]
>val)  //if mid > val , search in left half
            {
               high = mid-1;
            }
            else if(arr[mid]
<val) //if mid <  val , search in right half
            {
               low = mid+1;
            }
        }


        return -1;
    }

    public static void main(String[] args)
    {
        //perform binary search
        Scanner sc = new Scanner(System.in);

        //accept number of elements
        System.out.println("Enter number of elements in an array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        //accept elements in an array
        System.out.println("Enter elements of an array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //accept the element to search - val
        System.out.println("Enter element to be search :");
        int val = sc.nextInt();

        //sort element
//        Arrays.sort(arr);
//        System.out.println("Sorted array is : ");
//        for(int i=0;i<n;i++)
//        System.out.print(arr[i]+" ");
//        System.out.println();

        int res = binaryIterative(arr,val);
        if(res== -1)
        {
            System.out.println("Element is not present");
        }
        else
        {
            System.out.println("Element is  present at index "+res);
        }
//

    }

}
