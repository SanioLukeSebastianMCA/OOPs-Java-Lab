class StudentDetails{
	
	int sid, math_mrk, eng_mrk, sci_mrk;
	String sname;
	
	StudentDetails(){ 
		System.out.println("In Default Constructor");
		this.sid= 0001;
		this.sname= "Sanio Luke";
		this.math_mrk= 91;
		this.eng_mrk= 71;
		this.sci_mrk= 89;
	}
	
	StudentDetails(int sid, String sname, int math_mrk, int eng_mrk, int sci_mrk) {
		System.out.println("In Parameterized Constructor");
		this.sid= sid;
		this.sname= sname;
		this.math_mrk= math_mrk;
		this.eng_mrk= eng_mrk;
		this.sci_mrk= sci_mrk;
	}
	
	StudentDetails(int math_mrk, int eng_mrk, int sci_mrk) {
		System.out.println("In Mixed Constructor");
		sid= 999;
		sname= "Barry Allen";
		this.math_mrk= math_mrk;
		this.eng_mrk= eng_mrk;
		this.sci_mrk= sci_mrk;
	}
	
	void details(){
		System.out.println("The name of the student is : "+ sname);
		System.out.println("The student ID is : "+ sid);
		System.out.println("The mark of the Maths subject is : "+ math_mrk);
		System.out.println("The mark of the English subject is : "+ eng_mrk);
		System.out.println("The mark of the Science subject is : "+ sci_mrk);
		System.out.println("The total marks of all the subjects is : "+ (math_mrk+eng_mrk+sci_mrk)+" marks");
		System.out.println("The average marks of the all subjects is : "+ (math_mrk+eng_mrk+sci_mrk)/3+" marks");
		System.out.println("\n");
	}
}

class Student{
	public static void main(String[] args){
		
		StudentDetails s0= new StudentDetails();
		s0.details();
		
		StudentDetails s1= new StudentDetails(1000, "Michael", 81, 71, 54);
		s1.details();
		
		StudentDetails s999= new StudentDetails(63, 91, 48);
		s999.details();
	}
}