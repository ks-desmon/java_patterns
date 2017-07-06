class pat
{
	public static void main(String args[])
	{
		for(int q=0;q<=4;q++)
		{
			for(int w=4;w>=q;w--)
			{
				System.out.print("-");
			}
			for(int f=0;f<=q;f++)
			{
				System.out.print(f);
			}	
		System.out.println();
		}
		for(int i=5; i>=0; i--)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("-");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(k);
			}
		System.out.println();
		}
	}
}