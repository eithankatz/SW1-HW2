import java.util.Arrays;

public class Assignment02Q03 
{
	public static void main(String[] args) 
	{
		int numOfOdd = 0;
		int n = -1;
		// *** your code goes here below ***
		n=Integer.parseInt(args[0]);
		int arr[] = new int[n];
		arr[0]=1;
		arr[1]=1;
		numOfOdd=2;
		
		System.out.println("The first "+ n +" Fibonacci numbers are:");

		//generating Fibonacci array
		for(int i=2; i<n; i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
			if (arr[i]%2==1)
				numOfOdd++;
		}
		
		//printing the array
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		System.out.println("\nThe number of odd numbers is: "+numOfOdd);

	}
}
