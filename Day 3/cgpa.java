// to  calc cgpa of n marks
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
arr[i]=s.nextInt();
float res=cgpa(arr);
System.out.print(res);

    }
    
static float cgpa(int arr[])
{
int tot=0;
float cgpa;
for(int i=0;i<arr.length;i++)
tot=tot+arr[i];
  return (float)tot/arr.length;
    }  
}