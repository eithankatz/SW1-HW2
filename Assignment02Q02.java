
public class Assignment02Q02 
{
	public static void main(String[] args) 
	{	// do not change this part below
		double piEstimation = 0.0;
		
		// *** your code goes here below ***
		double denom = 1.0;
		double sign = 1.0;
		for (int i=0; i<Integer.parseInt(args[0]); i++)
		{
			piEstimation+=(4.0*sign/denom);
			denom+=2.0;
			sign*=-1.0;
		}
		
		// do not change this part below
		System.out.println(piEstimation + " " + Math.PI);

	}

}
