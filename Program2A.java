//Only prime numbers from an Array

package day1;

class Program2A
{
	public static void main(String[] args)
	{
		int[] arr={1,2,5,10,5,3};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int count=0;
			for(int j=1;j<=arr.length-1;j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.println(arr[i]);
			}
		}
	}
}