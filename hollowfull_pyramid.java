class HollowFull_Pyramid
{
	public static void main(String[] args)
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print(" ");
			}
			if(i<3 || i>5)
			{
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				System.out.print("* ");
				for(int l=3;l<=i;l++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}