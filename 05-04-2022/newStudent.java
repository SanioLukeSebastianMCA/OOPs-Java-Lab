import java.util.*;

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
	
	void details(){
		System.out.println("The name of the student is : "+ sname);
		System.out.println("The student ID is : "+ sid);
		System.out.println("The mark of the Maths subject is : "+ math_mrk);
		System.out.println("The mark of the English subject is : "+ eng_mrk);
		System.out.println("The mark of the Science subject is : "+ sci_mrk);
	}
	
	void total_avg_mark(){
		float total_mrk, avg_mark;
		total_mrk= math_mrk+eng_mrk+sci_mrk;
		avg_mark= total_mrk / 3;
		System.out.println("The total marks of all the subjects is : "+ total_mrk+" marks");
		System.out.println("The average marks of the all subjects is : "+ avg_mark+" marks");
		System.out.println("\n");
	}
}

class StudentModel{
	int sid, mark1, mark2, mark3;
	String sname;
	
	StudentModel() { }
	
	StudentModel(int sid, String sname, int mark1, int mark2, int mark3){
		this.sid= sid;
		this.sname= sname;
		this.mark1= mark1;
		this.mark2= mark2;
		this.mark3= mark3;
	}
	
	public int getSid(){
		return sid;
	}
	
	public String getSname(){
		return sname;
	}
	
	public int getMark1(){
		return mark1;
	}
	
	public int getMark2(){
		return mark2;
	}
	
	public int getMark3(){
		return mark3;
	}
}

class newStudent{
	public static void main(String[] args){
	
		StudentDetails s0= new StudentDetails();
		s0.details();
		s0.total_avg_mark();
	
		StudentDetails s1= new StudentDetails(1000, "Michael", 81, 71, 54);
		s1.details();
		s1.total_avg_mark();
		
		StudentDetails s2= new StudentDetails(1001, "Samiksha", 75, 66, 82);
		s2.details();
		s2.total_avg_mark();
		
		StudentDetails s3= new StudentDetails(1002, "Calvin", 92, 91, 87);
		s3.details();
		s3.total_avg_mark();
		
		ArrayList<StudentModel> studentArr= new ArrayList<>();
		studentArr.add(new StudentModel(1000,"Sanio",89,54,74));
		studentArr.add(new StudentModel(1000,"Avil",23,87,66));
		studentArr.add(new StudentModel(1000,"Tejas",73,56,87));
		studentArr.add(new StudentModel(1000,"Winston",74,24,75));
		studentArr.add(new StudentModel(1000,"Nebin",39,93,33));
		
		for(StudentModel s: studentArr){
			System.out.println("Arraylist is : "+s.sname);
		}
	}
}