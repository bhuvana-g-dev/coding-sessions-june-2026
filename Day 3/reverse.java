// reverse the array
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
arr[i]=s.nextInt();
rev(arr);
}
static void rev(int arr[])
{
    int i;
    int j;
for(i=0,j=arr.length-1;i<j;i++,j--)
{
int t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
for(i=0;i<arr.length;i++)
{
    System.out.print(" "+arr[i]);
}
    }  
}