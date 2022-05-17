// CO 3 : InnerClass & OuterClass

class outerClass{
	int i=10;
	
	class innerClass{
		int y= 5;
	}
}

public class innerClassExample{
	public static void main(String[] args){
		outerClass outer= new outerClass();
		outerClass.innerClass innerObj= outer.new innerClass();
		System.out.println("The value of i (from Outer) : "+outer.i);
		System.out.println("The value of y (from Inner) : "+innerObj.y);
	}
}