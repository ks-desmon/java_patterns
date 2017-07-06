class pro
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			for(int l=i;l<=4;l++)
			{
				System.out.print(" ");
			}	
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			  for(int k=4;k>=i;k--)
			{
				System.out.print("* ");
			} 
			 for(int l=1;l<=i;l++)
			{
				System.out.print(" ");
			} 
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			  for(int k=4;k>=i;k--)
			{
				System.out.print("* ");
			} 
		System.out.println();
		}
	}
}