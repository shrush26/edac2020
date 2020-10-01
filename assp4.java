import java.util.Scanner;
class assp4
{
 public static void main (String[] args)
 {
   int num;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the numberof rows:");
   num=sc.nextInt();
   int space=num;
 
   for(int i=1; i<=num; i++)
   {
     for(int j=1; j<=space; j++)
       {

         System.out.print(" ");

         }
         space--;
           for(int k=1; k<=i; k++)
           {
             System.out.print(" "+k);
            }
             for(int l=i-1; l>=1; l--)
             {
               System.out.print(" "+l);

              }
              System.out.println();
   }

  }


}