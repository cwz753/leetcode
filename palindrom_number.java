//leetcode question 
//palindrome number
//wrong answer

import java.util.Scanner;
class palindrom_number{
	public static void main(String[] args){
		
		solution s=new solution();
		Scanner in=new Scanner(System.in);
		
		System.out.println("input a integer please");
		int x=in.nextInt();
	/*	
		System.out.println("string");
		String y=in.nextLine();
		

		System.out.println("input a float");
		float f=in.nextFloat();
		System.out.println(x+"  "+y+"   "+f+"   ");
	*/	
		boolean result=s.isPalindrom(x);
		System.out.println(result);

		System.out.println("see see"+6/10+"   "+197%100);
	}

}

class solution{
	public boolean isPalindrom(int x){
	 if(x<0){
		System.out.println("it is negative, not palindrome number");
		return false;
	}
	int left=10, right=1;
	while(x/right!=0){
		right*=10;
	}
	System.out.println(right+"=right");
	right=right/10;
	System.out.println((x%left)+"   "+x/right);
	if(x<10) return true;
	while(x!=0){
		
		if ((x%left)/(left/10)!=(x/right)/(left%10))//x/right is the first letter, x%left is the last letter
		{			       
		System.out.println((x/right)/(left%10)+"    "+(x%left)/(left/10)+"it is not palindrome");
		return false;
		}

		left*=10;					
		right/=10;
	}
	return true;
	}
}
