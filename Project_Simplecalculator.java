import java.util.*;
import java.lang.*;
/* Simple Calculator
   author @ M.SaiPrasad
   */

class Project_Simplecalculator
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		double a,b,c=0.0;
		int ch;
		System.out.println("enter the first number");
		a=obj.nextDouble();
		System.out.println("enter the second number");
		b=obj.nextDouble();
		System.out.println("Press 1 for addition\n Press 2 for subtraction\n Press 3 for multiplication \n Press 4 for division \n Press5 for a powerof b\n");
		System.out.println("enter your choice");
		ch=obj.nextInt();
		switch(ch)
		{
			case 1:
			c=a+b;
			System.out.println("the addition of" +a+ "+" +b +"=" +c);
			break;
			case 2:
			c=a-b;
			System.out.println("the subtraction of" +a+ "-" +b +"="+c);
			break;
			case 3:
			c=a*b;
			System.out.println("the multiplication of" +a+ "*" +b+"=" +c);
			break;
			case 4:
			c=a/b;
			System.out.println("the division of" +a+ "/"+ b+ "="+c);
			break;
			case 5:
			c=Math.pow(a,b);
			System.out.println("a powerof b " +a+ "powerof" +b+ "=" +c);
			break;
			default:
			System.out.println("you entered incorrect choice");
		}
	}
}
