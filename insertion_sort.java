import java.util.*;
public class insertion_sort{

	void insertionsort(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
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
		 s.insertionsort(a);
		 System.out.println("sorted elements of the array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}