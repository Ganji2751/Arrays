import java.lang.*;
import java.util.*;

class P3
{
	public static void main(String args[])
	{
		int x[] = new int[]{1,4,34,56,7};
		int flag=0,pos=0;
		System.out.print("enter number to be searched for: ");
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();
		for(int i=0;i<x.length;i++)
		{
			if(search==x[i])
			{
				flag=1;
				pos=i+1;
			}
		}
		if(flag==1)
			System.out.println(pos);
		else
			System.out.println("-1");
	}	
}