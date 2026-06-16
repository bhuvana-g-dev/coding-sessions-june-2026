import java.util.*;
public class FrequencyOfEach {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();

        frequency(arr);
    }

    static void frequency(int x[]) {

        int max = x[0];

        for(int i=1;i<x.length;i++)
            if(max < x[i])
                max = x[i];

        int a[] = new int[max + 1];

        for(int i=0;i<x.length;i++)
            a[x[i]]++;

        for(int i=0;i<x.length;i++) {
            if(a[x[i]] != 0) {
                System.out.println(x[i] + " -> " + a[x[i]]);
                a[x[i]] = 0;
            }
        }
    }
}