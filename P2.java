import java.lang.*;
import java.util.*;

class P2
{
	public static void main(String args[])
	{
		int x[] = new int[]{1,2,3,4};
		int max=x[0],min=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
				max=x[i];
			if(x[i]<min)
				min=x[i];
		}
		System.out.println("The maximum element in the array elements: "+min);
		System.out.println("The minimum element the array elements: "+max);
	}	
}