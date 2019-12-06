import java.util.*;
import java.lang.*;

class P7
{
	public static void main(String args[])
	{
		int dup[] = new int[]{12,34,12,45,67,89};
		int n = dup.length;
		Arrays.sort(dup);
		int array[] = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(dup[i]!=dup[i+1])
			{
				array[j++] = dup[i];
			}
		}
		array[j++] = dup[n-1];
		for(int k=0;k<j;k++)
		{
			dup[k]=array[k];
		}
		for(int i=0;i<j;i++)
			if(i!=j-1)
				System.out.print(dup[i]+",");
		System.out.println(dup[j-1]);
	}
}