import java.io.*;
import java.lang.*;
class Sort
{
	public static void main(String args[])throws IOException
	{
		int ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
	{
		System.out.println("\n\n\n1.Bubble Sort\n2.Selection Sort\n3.Insertion Sort.\n4.Quick Sort.\n5.Merge Sort.\n6.Exit.");
		 ch=Integer.parseInt(br.readLine());
		if(ch==6)
			return;
		System.out.println("Enter n");
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		switch(ch)
		{
			case 1:
				BinarySort(a,n);
				break;
			case 2:
				SelectionSort(a,n);
				break;
			case 3:
				InsertionSort(a,n);
				break;
			case 4:
				int start=0;
				int end=n-1;
				QuickSort(a,start,end);
				print(a,n);
				break;
			case 5:
				MergeSort(a,n);
				print(a,n);	
				break;
		}
		
	}
	while(ch!=6);
	}
	public static void BinarySort(int a[],int n)
	{
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[(j+1)])
				{
					temp=a[j];
					a[j]=a[(j+1)];
					a[(j+1)]=temp;
				}
			//System.out.print(a[j]);
			}
			//System.out.println();
			
		}
		print(a,n);
	}
	public static void SelectionSort(int a[], int n)
	{
		for (int i=0;i<n-1;i++)
		{
			int imin=i;
			int temp;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[imin])
					imin=j;
			}
					temp=a[i];
					a[i]=a[imin];
					a[imin]=temp;
		}
		print(a,n);
	}
	public static void InsertionSort(int a[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int val=a[i];
			int hole=i;
			while(hole>0&&a[hole-1]>val)
			{
				a[hole]=a[hole-1];
				hole=hole-1;
			}
			a[hole]=val;
		}
		print(a,n);
	}
	public static void MergeSort(int a[],int n)
	{
		
		if(n<=1)
			return;
		int mid=n/2;
		int left[]=new int[mid];
		int right[]=new int[n-mid];
		for(int i=0;i<mid;i++)
			left[i]=a[i];
		for(int i=mid;i<n;i++)
			right[i-mid]=a[i];
		MergeSort(left,mid);
		MergeSort(right,n-mid);
		Merge(left,right,a);
		
	}
	public static void Merge(int left[],int right[],int a[])
	{
		int nL=left.length;
		int nR=right.length;
		int i,j,k;
		i=j=k=0;
		while(i<nL&&j<nR)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
				k++;
			}
			else
			{
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<nL)
		{
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<nR)
		{
			a[k]=right[j];
			j++;
			k++;
		}
	}
	public static void QuickSort(int a[],int start,int end)
	{
		if(start<end)
		{
		int pIndex=QuickPartition(a,start,end);
		QuickSort(a,start,pIndex-1);
		QuickSort(a,pIndex+1,end);
		}
		else
			return;
		
	}
	public static int QuickPartition(int a[],int start,int end)
	{
		int temp;
		int pivot=a[end];
		int pIndex=start;
		for(int i=start;i<end;i++)
		{
			if(a[i]<=pivot)
			{
				//swap a[i],apindex
					temp=a[i];
					a[i]=a[pIndex];
					a[pIndex]=temp;
					pIndex++;
			}
		}
					temp=a[pIndex];
					a[pIndex]=a[end];
					a[end]=temp;
					return pIndex;
	}
	public static void print(int a[],int n)
	{
		System.out.println();
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
	}
}