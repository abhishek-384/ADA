import java.util.*;
public class quickSort{

	public static void quickSort(int[] a,int low,int high){
      // int low = 0;
      // int high = a.length - 1;
      if (low < high) {
         int pi = partition(a, low, high);
         quickSort(a, low, pi - 1);
         quickSort(a, pi + 1, high);
      }
   }
	public static void main(String[] args) {
		insertion_sort s=new insertion_sort();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements of the array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		 s.quickSort(a,0,a.length-1);
		 System.out.println("sorted elements of the array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}