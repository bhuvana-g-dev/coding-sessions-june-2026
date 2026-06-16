 import java.util.*;
public class FindDupli {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();

        duplicate(arr);
    }

    static void duplicate(int x[]) {

        int max = x[0];

        for(int i=1;i<x.length;i++)
            if(max < x[i])
                max = x[i];

        int a[] = new int[max+1];

        for(int i=0;i<x.length;i++)
            a[x[i]]++;

        for(int i=0;i<x.length;i++) {

            if(a[x[i]] > 1) {
                System.out.print(x[i] + " ");
                a[x[i]] = 0;
            }
        }
    }
}
