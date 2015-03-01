//leetcode67

public class add_binary{
	public static void main(String[] args){

		String input1="1010";
		String input2="1011";


	}
}


class solution{
	public String addBinary1(String a, String b){
		int alen=a.length();
		int blen=b.length();
		int len=Math.max(alen,blen);
		if (len==0) return " ";
		String result=new String();
		
		int pa,pb,carry=0,sum=0;
		while(pa>=0 || pb>=0){
			if(pa>=0){
				sum=sum+a.charAt(pa)-'0';
				pa--;
			}
			if(pb>=0){
				sum=sum+b.charAt(pb)-'0';
				pb--;
			}
			if(carry==1){
				sum++;
			}
			//sum+=carry;
			carry=(sum==2)?1:0;
			result.	

		
		}

	}

	public String addBinary2(String a, String b){



	}



}
