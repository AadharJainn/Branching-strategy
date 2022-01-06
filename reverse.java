import java.util.*;
class reverse
{ public static void main(String[] args)
	{ Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str=sc.nextLine();
		StringBuffer b=new StringBuffer(str);
		b.reverse();
		
	
	    if(str.equals(b))
			{
				System.out.println("String is palindrome");
				
			} 
		else
		{
			System.out.println("String is not palindrome");
			System.out.println("Will be adding new feature from branch feature1 !");
		}

}   }