import java.util.*;
import java.lang.*;
/* Guessing Number in 3 attempts
   author @ M.SAI PRASAD */
class Guessing_Number
{
	public static void main(String[] args)
	{
		
		int random_no,guess_no;
		int count=0;
		int max=3;
		Scanner obj=new Scanner(System.in);
		random_no=(int)(Math.random()* 9+1); 
		// double value is generated usually by random function and we are converting to int value.
		do{
			count++;
			if(count>max){
				System.out.println("you have run out of chances..");
				break;
						}
			else{
			System.out.println("enter the guess value");
			guess_no=obj.nextInt();
			System.out.println("your guess number is" +guess_no);
			if (guess_no==random_no)
			{
				System.out.println("you have guessed correct and guess no is" + guess_no +"and random no is" +random_no);
				
				System.out.println("you have guessed in\t" +count +"attempt");
			}
			else if (guess_no<random_no)
			{
				System.out.println("your guess is too low..try again"+"your turns left"+(3-count));
				
			}
			else if (guess_no>random_no)
			{
				System.out.println("your guess is too high..try again"+"your turns left"+(3-count));
				
			}
			}
		}while(random_no!=guess_no);
		
	}
}
		
			