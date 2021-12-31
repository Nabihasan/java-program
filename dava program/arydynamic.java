//2-D dyanmic array ? matrix program
import java.util.Scanner;
class Demo
{
	public static void main(String gg[])
	{
		Scanner sc=new Scanner(System.in);	
			System.out.println("enter the row");
			int r=sc.nextInt();
			System.out.println("enter the col");
			int c=sc.nextInt();

		int ary[][]=new int[r][c];
		System.out.println("enter  "+r*c+"element");
		for(int i=0 ;i<r ; i++)
		{
			for(int j=0 ;j<c ; j++)
			{
				ary[i][j]=sc.nextInt();	
			}
		}
		System.out.println("array elements are:");
			for(int i=0 ; i<r ; i++)
		{

		         for(int j=0 ; j<c ; j++)
			
			{
				System.out.print(ary[i][j]+" ");	
			}
			
			System.out.println();
			
		}	
	 }


	
}