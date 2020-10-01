public class Invertedfull_Pyramid 
{
    
    public static void main(String args[])
    {
        int n=6;//size
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=1;j--)
            {
                if(i>=j)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
