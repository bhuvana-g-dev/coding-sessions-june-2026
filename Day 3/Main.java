// prime
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=s.nextInt();
    printPrime(arr);
}
static void printPrime(int arr[])
{
for(int i=0;i<arr.length;i++)
if(arr[i]>1 && isPrime(arr[i]))
System.out.print(arr[i]+" ");
}
 static boolean isPrime(int n)
 {
    for(int i=2;i<n;i++)
    if(n%i==0)
    return false;
    return true;
 }
}