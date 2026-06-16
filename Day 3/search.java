// Search an element
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=s.nextInt();
    int k=s.nextInt();
    if(search(arr,k))
    System.out.print("yes");
    else
    System.out.print("no");
}
static boolean search(int arr[],int k)
{
    int i;
    for(i=0;i<arr.length;i++)
  if(k==arr[i])
  return true;
  return false;
    
}
}