import java.util.Scanner;
class BinarySearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of elements you want:");
		int n=sc.nextInt(); 
		int a[]=new int[n];
		System.out.println("Enter elements in ascending order");
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		System.out.print("Enter element you want to search:");
		int e=sc.nextInt();
		boolean found=false;
		int low=0,high=n-1,mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==e)
			{	
				found=true;
				break;
			}	
			else if(e>a[mid])
				low=mid+1;
			else
				high=mid-1;
		}
		if(found==true)
			System.out.println("Found at position "+(mid+1));
		else
			System.out.println("Not found");
	}
}
