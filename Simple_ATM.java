import java.lang.*;
import java.util.*; 
/* Simple ATM Machine
	author @M.SAIPRASAD */
class Simple_ATM
{
	public static void main(String[] args)
	{
		float balance=1000.0f;
		float deposit,withdraw;
		int ch;
		Scanner obj=new Scanner(System.in);
		System.out.println("welcome to ATM...");
		while(true){
		System.out.println("Press 1 for withdraw option");
		System.out.println("Press 2 for deposit option");
		System.out.println("press 3 for check balance");
		System.out.println("press 4 for exit");
		System.out.println("choose your option");
		ch=obj.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("enter the withdraw amount");
			withdraw=obj.nextFloat();
			if(balance>=withdraw)
			{
				balance=balance-withdraw;
				System.out.println("amount has been successfully withdrawn");
			}
			else
			{
				System.out.println("Insufficient funds");
			}
			break;
			case 2:
			System.out.println("enter the amount to deposit");
			deposit=obj.nextFloat();
			balance+=deposit;
			System.out.println("amount has been successfully deposited");
			break;
			case 3:
			System.out.println("checking balance..please wait");
			System.out.println(balance);
			break;
			case 4:
			System.exit(0);
		}}
	}
}
