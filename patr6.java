class pat
{
	public static void main(String args[])
	{
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
			for(int l=i-1;l>=0;l--)
			{
				System.out.print(l);
			}
			
		System.out.println();
		}
	}
}