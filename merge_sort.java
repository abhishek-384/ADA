import java.util.*;
public class merge_sort{

	void MergeSort(int a[],int lb,int ub)
	{
		int mid;
        if(lb<ub)
        {
        	mid=(lb+ub)/2;
        	MergeSort(a,lb,mid);
        	MergeSort(a,mid+1,ub);
        	Merge(a,lb,mid,ub);
        }
	}

	void Merge(int a[],int lb,int mid,int ub)
	{
		int i=lb; 
		int j=mid+1;
		int k=lb;
		int b[]=new int[100];
		while(i<=mid&&j<=ub)
		{
			if(a[i]<=a[j])
			{
				b[k]=a[i];
				i++;k++;
			}
			else
			{
				b[k]=a[i];
				j++;k++;
			}
		}
		if(i>mid)
		{
			while(j<=ub)
			{
				b[k]=a[j];
				j++;k++;
			}
		}
		else if(j>ub)
		{
			while(i<=mid)
			{
				b[k]=a[i];
				i++;
				k++;
			}
		}
	}
	public static void main(String[] args) {
		merge_sort s=new merge_sort();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements of the array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		 s.MergeSort(a,0,a.length-1);
		 System.out.println("sorted elements of the array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}