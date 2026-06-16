// non repeating
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
arr[i]=s.nextInt();
nonRepeat(arr);
}
static void nonRepeat(int arr[])
{
    int i;
    int max=arr[0];
    for(i=0;i<arr.length;i++)
    {
    if(max<arr[i])
    max=arr[i];
    }
    int a[]=new int[max+1];
for(i=0;i<arr.length;i++)
{
a[arr[i]]=a[arr[i]]+1;
}
for(i=0;i<arr.length;i++)
{
    if(a[arr[i]]==1){
    System.out.print("  "+arr[i]);
    a[arr[i]]=0;
    }
}
    }  
}