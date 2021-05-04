import java.util.*;
public class selection_sort{
	void selectionsort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min_indx=i;
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[min_indx])
					min_indx=j;
			int temp=arr[min_indx];
			arr[min_indx]=arr[i];
			arr[i]=temp;	
		}
	}
	public static void main(String[] args) {
		selection_sort s=new selection_sort();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements of the array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		 s.selectionsort(a);
		 System.out.println("sorted elements of the array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}