public class roman_integer{
	public static void main(String[] args){
	conversion c=new conversion();
	System.out.println(c.fromRomanToInteger("MCMXC"));
	



	}



}


class conversion{
	private static int singleRomanToInteger(char letter){
		switch(letter){
			case 'M': return 1000;
			case 'D':return 500;
			case 'C': return 100;
			case 'L': return 50;
			case 'X': return 10;
			case 'V': return 5;
			case 'I': return 1;
			default: return 0;//dont forget!!!
		}
	}


	int  fromRomanToInteger(String roman){
		if(roman.length()==0) return 0;
		String uromman=roman.toUpperCase();
	
		int result=0;//if result is defined in the for loop, it could not be returned directly
		for(int i=0;i<roman.length()-1;i++){
			if(singleRomanToInteger(uromman.charAt(i)) < singleRomanToInteger(uromman.charAt(i+1)))
			result=result-singleRomanToInteger(uromman.charAt(i));
	
			else
			result=result+singleRomanToInteger(uromman.charAt(i));

		}
			result=result+singleRomanToInteger(uromman.charAt(roman.length()-1));//add the last letter...
			//if and else just added up all the letters except the last one..	
		return result;//result must be defined in the main body, instead of in the for loop
	}	



	String fromIntegerToInteger(int x){
		if(x<=0) return "";
		String str="";

		return "string";
	}


	
}
