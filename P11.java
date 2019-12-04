import java.lang.*;
import java.util.*;

class P11
{
	public static void main(String args[])
	{
		int x[][] = new int[3][3];
		int n=0;
		int max=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				x[i][j]=Integer.parseInt(args[n]);
				n++;
				if(x[i][j]>max)
					max=x[i][j];
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("the maximum number in the array is : "+max);
	}	
}