  //ARMSTRONG NUMBER
import java.util.*;
import java.lang.String;
class Armstrong
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int r,sum=0,m;
    m=n;
    while(n!=0)
   {
     r=n%10;
     sum=sum+(r*r*r);
     n=n/10;
  }
 if (m==sum)
 System.out.println(m + "is armstrong number");
else 
  System.out.println(m+ "is not armstrong number");
 }
 
}