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
<<<<<<< HEAD
			System.out.println("Will be adding new feature from branch feature2 !");
=======
			System.out.println("Will be adding new feature from branch feature1 !");
>>>>>>> f03430d9597c2140d3214236f22c4e64b3d86d31
		}

}   }