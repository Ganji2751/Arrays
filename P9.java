import java.util.*;
import java.lang.*;

class P9
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		n = sc.nextInt();
		int array[] = new int[n];
		int pos6=0,pos7=0,sum=0;
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(array[i]==6)
				pos6 = i;
			if(array[i]==7)
				pos7 = i;
		}
		if(pos6<pos7)
		{
			for(int i=0;i<pos6;i++)
				sum=sum+array[i];	
			for(int i=pos7+1;i<n;i++)
				sum=sum+array[i];
		}
		else
		{
			for(int i=0;i<n;i++)
				sum=sum+array[i];
		}
		System.out.println(sum);
	}
}