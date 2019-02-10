import java.io.*;
import java.util.*;
class Product
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	int c=a*b;
	if(c%2==0)
	{
		System.out.println("even");
	}
	else
	{	
		System.out.println("odd");
	}
  }
}
