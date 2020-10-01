import java.util.Scanner;

class assp2
{
 public static void main(String[] args)
 {
  int p,i,j;
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of rows:");
  p=sc.nextInt();
    int space=p;

  for(i=1; i<=p; i++)
  {
   for(j=1; j<=space; j++)
    {
     System.out.print(" ");
    }  
   space--;
   for(int k=1; k<=i; k++)
   {
     System.out.print(k+" ");
    
   }
   System.out.println();
  }
  
 }
}