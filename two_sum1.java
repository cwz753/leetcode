//java two sum
//Given an array of integers, find two numbers such that they add up to a specific target number.
//
//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

// for leetcode cheat:: the first element in an array is 1 not 0. so if we want leetcode to pass this file, you need to add 1 in the two situations below::
//result[1]=i+1;
//hm.put(numbers[i],i+1);


import java.util.HashMap;

public class two_sum1 {
	public static void main (String[] args){
		solution s=new solution();
		int[] test={1,2,8,10};
		int[] results=s.t(test,16);
		System.out.println(results[0]+"  "+results[1]+"  ");

}

}


class solution{

	public int[] t(int[] numbers, int target){
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int[] result=new int[2];//int[] result=null;has to be 2 but not 1...
		int len=numbers.length;
		for(int i=0; i<len; i++){
			int expect=target - numbers[i];
			System.out.println("expected is "+expect+"	when i="+i);
			//if(hm.containsValue(expect)){
			if(hm.containsKey(expect)){
				result[0]=hm.get(expect);
				result[1]=i;
				break;//will enhance the efficiency!!!
				//return new int[]{hm.get(expect),i};
				}
			//hm.put(i+1,numbers[i]);
			hm.put(numbers[i],i);//the reason do it this way instead of the above line is because, hashmap.get(index)=value, there is no hashmap.getvalue()val ...and we need to get the index in the array numbers using the value we already know, which is expect and numbers[i]
		}
		
		return result;

	}

}
