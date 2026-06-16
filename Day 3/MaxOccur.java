import java.util.*;
public class MaxOccur {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();

        maxOccurrence(arr);
    }

    static void maxOccurrence(int x[]) {

        int max = x[0];

        for(int i=1;i<x.length;i++)
            if(max < x[i])
                max = x[i];

        int a[] = new int[max+1];

        for(int i=0;i<x.length;i++)
            a[x[i]]++;

        int maxFreq = 0;
        int element = 0;

        for(int i=0;i<a.length;i++) {

            if(a[i] > maxFreq) {
                maxFreq = a[i];
                element = i;
            }
        }

        System.out.print(element);
    }
}
