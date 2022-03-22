public class Sample{	

	int intVal;
	String strVal;

	Sample(){ }
	
	Sample(int intVal, String strVal){
		this.intVal= intVal;
		this.strVal= strVal;
	}
	
	void display(){
		System.out.println("The name is "+strVal+" and I am "+intVal+" years old.");
	}
	
	void concatFun(){
		String s1= "This is 1st line. ";
		String s2= "This is 2nd line.";
		String s3= s1+s2;
		System.out.println("The concat final string is : "+s3);
	}
	
	void math(){
		int num1= 10;
		int num2= 6;
		int addVal= num1+num2;
		int subVal= num1-num2;
		float divVal= num1/num2;
		int mulVal= num1*num2;
		int modVal= num1%num2;
		
		System.out.println("The addition of 2 numbers is : "+addVal);
		System.out.println("The subtraction of 2 numbers is : "+subVal);
		System.out.println("The multiplication of 2 numbers is : "+mulVal);
		System.out.println("The division of 2 numbers is : "+divVal);
		System.out.println("The modulus of 2 numbers is : "+modVal);
	}
	
	public static void main(String... args){
		
		//1. String... args
		//2. String[] args
		//3. String args[]
		
		System.out.println("Hello World !!");
		Sample sample1= new Sample(21, "Sanio");
		Sample sample2= new Sample();
		sample1.display();
		sample2.concatFun();
		sample2.math();
	}
}

