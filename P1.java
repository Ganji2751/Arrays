import java.lang.*;
import java.util.*;

class P1	
{
	public static void main(String args[])
	{
		int x[] = new int[]{1,2,3,4};
		int sum=0;
		double avg=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		avg=sum/x.length;
		System.out.println("The Sum of the array elements: "+sum);
		System.out.println("The Average of the array elements: "+avg);
	}	
}