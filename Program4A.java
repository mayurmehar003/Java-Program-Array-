package day1;

//Program4A:In array element seperate them based on odd number and even number

class Program4A
{
public static void main(String[] args)
{
	int[] arr={1,2,3,4,5,61,10,20};
	
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[i]%2==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}