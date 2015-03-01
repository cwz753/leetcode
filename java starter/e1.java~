//this is my first java exercises feb.17

class e1{

	public static void main(String args[]){//string "S" must be capitalized!!

		System.out.println("hello world");
        float rawgrade[]={10,20};
		double finalgrade, curve=1.2;
		finalgrade=curve*calcgrade(rawgrade);
		System.out.println(finalgrade);
		displayerror("this is error message");
		

		myClass x=new myClass();
		subclass1 y=new subclass1();
		subclass2 z=new subclass2();
		y.print();
		z.print();
}
		

static float calcgrade(float test[]){
		return (test[0]/test[1])*100;	
	}


static void displayerror(String errorMsg){

		System.out.println(errorMsg);
	}


}//ends e1 main 


class myClass{

		int student;
		myClass(){student=0;}
		myClass(int x) {student=x;}
		protected void print(){
				System.out.println("this is from myclass, the supercalss");
					
	System.out.println("student="+student);}
	
		class innerClass{
			void print(){System.out.println("hello, student "+student);}
		}
		protected void finalize(){}

}

class subclass1 extends myClass{
	private int sub;
	subclass1(){super(5050);}
	//subclass1(){super(100);}

	//protected void print(){System.out.println("this is from subclass1");}
}

class subclass2 extends subclass1{
//	subclass2(){super(100);}
	protected	void print(){System.out.println("this is from subclass222");}

}

//class
//1.myClass x=new myClass();
//2. myClass x; x=new myClass();
//3. myClass x,y, z; x=new myClass(); z=x;
//
//finalize() method member is called after the instance goes out of scoe and immediately before the instance is picked up by java's garbage collection. that is, the finalize() method member is called after the destructor is called and before the instance is removed from memory...


