import java.util.*;

public class maxDifferenece {
    static int reverse(int n)
    {
        int rev=0;
        while(n>0){
            rev = rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    static int difference(int arr[],int n)
    {
        int max=-1;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(reverse(arr[i]));
        }
        int maxEl = al.get(0);
        int minEl = al.get(0);
        for(int i=0;i<n;i++)
        {
            maxEl = Math.max(maxEl,al.get(i));
            minEl = Math.min(minEl,al.get(i));
        }
        max = maxEl-minEl;
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum Difference is "+difference(arr,n));
    }

}
