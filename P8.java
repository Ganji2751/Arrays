import java.util.*;
import java.lang.*;

class P8
{
	public static void main(String args[])
	{
		int array[] = new int[]{10,20,10,30,40,100,99};
		int max=0,count=1,pos=0;
		int n=array.length;
		Arrays.sort(array);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(array[j]==array[j+1])
					count++;
				else
					break;		
			}
			if(count>max)
			{
				max=count;
				pos = i;
			}count=1;
		}
		System.out.println(array[pos]);
	}
}