//Identify Diplicate number from Array

package day1;

class Program1A
{
	public static void main(String[] args)
	{
		int[] arr={10,25,10,5,2};
		
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
			
			
			
			
		}
	
	}
	
}