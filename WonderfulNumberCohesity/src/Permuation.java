
import java.util.*;
public class Permuation {

    public static String getPermutation(int n,int k){
        int product = 1;
        int [] factorial = new int[n+1];
        factorial[0] =1;

        for(int i=1;i<=n;i++){
            product*=i;
            factorial[i] = product;
        }

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            int block = factorial[n-i];
            int index = (k-1) / block;
            int curr = list.get(index);
            sb.append(String.valueOf(curr));
            list.remove(Integer.valueOf(curr));
            k = k- index* block;
        }

        return sb.toString();
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String res = getPermutation(n,k);
        System.out.println("k th smallest number is " + res);
    }

}
