package day1;

class Program3A
{
	public static void main(String[] args)
	{

		int[] arr= {1,2,5};
		
		int[] arr1= {5,6,10};
		
		int[] newarr=new int[arr.length+arr1.length];        // 3rd array which contain array1 and array2
		
		int k=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			newarr[k]=arr[i];
			k++;
		}
		
		int l=0;
		for(int j=0;j<=arr1.length-1;j++)
		{
			newarr[arr.length+l]=arr1[l];
			l++;
		}
		
		
		for(int m=0;m<=newarr.length-1;m++)    
		{
			System.out.print(newarr[m]+" ");
		}
		
		
		
		
	}
}