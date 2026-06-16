// count occurence
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=s.nextInt();
    int k=s.nextInt();
    int res=search(arr,k);
    System.out.print(res);
}
static int search(int arr[],int k)
{
    int i;
    int cnt=0;
    for(i=0;i<arr.length;i++){
  if(k==arr[i])
  cnt++;
    }
    return cnt;
}
}