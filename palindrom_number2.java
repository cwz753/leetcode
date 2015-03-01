//leetcode question 
//palindrome number

import java.util.Scanner;
class palindrom_number2{
	public static void main(String[] args){
		
		solution s=new solution();
		Scanner in=new Scanner(System.in);
		
		System.out.println("input a integer please");
		int x=in.nextInt();
		
		boolean result=s.isPalindrom(x);
		System.out.println(result);

	}

}

class solution{
	public boolean isPalindrom(int x){
	 if(x<0){
		System.out.println("it is negative, not palindrome number");
		return false;
	}

	int right=1;
/*
 * it is not good since it may overflow if x=10000 00001, right could be 10000 0000 00
	while(x/right!=0){
		System.out.println(right+"=right");
		right*=10;
	}
	System.out.println(right);
	right/=10;
*/
	while(x/right>=10){right*=10;}
	System.out.println(right+"=rrrrrrrrrrrright");
	System.out.println(x%10+"   "+x/right);
	//if(x<10) return true;
	int temp=x;
	while(temp!=0){
		System.out.println(temp+"=temp		"+ right+"=       ");
		if(temp%10 != temp/right ){//temp/right is the first; temp%10 is the last
			System.out.println("it is not pad...");	
			return false;
		}
		float o=(temp/right) *right;
		System.out.println(o+"temp/right*right");		
		temp=(temp-(temp/right)*right-temp%10)/10;
		
		right=right/100;
		
	}

		right/=10;
	
	return true;
	
}
}
