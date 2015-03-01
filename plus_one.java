//leetcode
//
//import java.lang.Arrays;
public class plus_one{
	public static void main(String[] args){
		solution s=new solution();
		int[] a={1,2,3,4,5};
		int[] b={2,2,2,9};
		int[] c={9,9,9};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"   ");
		}	
		int[] ra=s.plusOne(a);
		int[] rb=s.plusOne(b);
		int[] rc=s.plusOne(c);
		System.out.println();	
	//	int[] ra=new int[5];
		//int[] rb=new int[4];
	//	int[] rc=new int[4];
	
		for(int j=0;j<ra.length;j++){
			System.out.print("    "+ra[j]);
		}
		System.out.println();	
		for(int j=0;j<rb.length;j++){
			System.out.print("    "+rb[j]);
		}
		System.out.println();
		for(int j=0;j<rc.length;j++){
			System.out.print("    "+rc[j]);
		}
//		System.out.println("bbbb"+rb);
//		System.out.println("cccc"+rc);		
	}

}

class solution{
	public int[] plusOne(int[] digits){
		if (digits.length==0) {	
			//result=digits;
			//return result;
			return digits;	
		}
	//	int len=digits.length;

		if(digits[digits.length-1]<9){
			digits[digits.length-1]++;
			return digits;
		}

		int carry=1;
		for(int i=(digits.length-1);i>=0;i--){
			if(carry+digits[i]>9){
				carry=1;
				digits[i]=0;

			}
			else{	
				digits[i]++;
			//	return digits[i]++
				break;
			} 
		}
		
		if(digits[0]!=0) return digits;
		else{		
			int[] result=new int[digits.length+1];
			result[0]=1;
			for(int j=1;j<digits.length+1;j++){
				result[j]=digits[j-1];
			}
		return result;
		}		}   }
