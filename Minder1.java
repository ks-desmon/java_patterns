class Minder
{
	public static void main(String arg[])
	{	
		for(int i=1;i<=5;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print(" ");//-
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=7;k++)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=2;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int k=1;k<=7;k++)
			{
				System.out.print(" ");
			}
			for(int m=2;m>=i;m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
		for(int i=6;i>=1;i--)
		{
			for(int j=i-1;j<=6;j++)
			{
				System.out.print(" ");
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print("* ");
			}
				System.out.println();
		}
	
	}
}