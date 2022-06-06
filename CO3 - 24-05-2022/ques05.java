class Student {
    int stud_id;
    String stud_name, academic;

    Student(int stud_id, String stud_name, String academic) {
        this.stud_id = stud_id;
        this.stud_name = stud_name;
        this.academic= academic;
    }
}

class Sports extends Student {

    String sport_name;
    int sports_score;

    Sports(int stud_id, String stud_name, String academic, String sport_name) {
        super(stud_id, stud_name, academic);
        this.sport_name= sport_name;
    }
}

class Result extends Sports{
    
    int sports_score;
    
    Result(int stud_id, String stud_name, String academic, String sport_name, int sports_score) {
        super(stud_id, stud_name, academic, sport_name);
        this.sports_score= sports_score;
    }
}


public class ques05 {
    public static void main(String[] args) {   
        Result result= new Result(1000, "Daniel Philip", "BSCIT", "Cricket", 100);
        System.out.println("The academic of the student: "+result.stud_name+" is: " + result.academic);
        System.out.println("The sports score of the student: "+result.stud_name+" is: " + result.sports_score);
    }
}
