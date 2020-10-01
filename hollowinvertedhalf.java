  class HollowInvertedHalf 
{

	public static void main(String[] args) 
	{

		for (int k = 1; k <= 6; k++) 
		{
			System.out.print("* ");
		}
		System.out.println();

		for (int j = 5; j >= 1; j--)// row

		{
			for (int i = 1; i <= j; i++) 
			{
				if (i == 1 || i == j) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}