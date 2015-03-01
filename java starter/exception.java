class exception{

	public static void main(String args[]){

		try{

			int a[]=new int[3];
			a[0]=10;
			a[1]=0;
			a[2]=a[0]/a[1];
		}catch(ArithmeticException e){System.out.println("Error::"+e);}
		catch(ArrayIndexOutOfBoundsException e){System.out.println("Error2:"+e);}

/*nesting try block::
 try{
		try{}catch{}
	}catch{}


*/
finally{int a=10;
		System.out.println(a+" this is the finally code has to be executed");}



	}






}

