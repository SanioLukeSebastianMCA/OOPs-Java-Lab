import java.util.Scanner;

class CustomFormException extends Exception{
    public CustomFormException(String errorMessage){
        super(errorMessage);
    }
}

public class ques02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String username, password;
        String passregex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";

        System.out.println("Enter the username : ");
        username= sc.nextLine();

        System.out.println("Enter the password : ");
        password= sc.nextLine();

        try {
            if(username==null){  
                sc.close();
                throw new CustomFormException("The Username is empty !! Cannot be empty !! Please fill."); 
            }
            else if(password==null){  
                sc.close();
                throw new CustomFormException("The password is empty !! Cannot be empty !! Please fill.");  
            }
            else if(username.trim().isEmpty()){
                sc.close();
                throw new CustomFormException("Only white spaces allowed in username is not allowed !!");
            }
            else if(password.trim().isEmpty()){
                sc.close();
                throw new CustomFormException("Only white spaces allowed in pass is not allowed !!");
            }
            else if(username.length() < 4){
                sc.close();
                throw new CustomFormException("The username should be greater than 4 characters !!");
            }
            else if(!password.matches(passregex)){
                sc.close();
                throw new CustomFormException("The password does match the pattern !!\nThe password should have atleast-\n1. One lower case alphabet.\n2. One upper case alphabet.\n3. One numeric value.\n4. One special characters like !@#$%^&*_ etc.\n5. 8-20 characters.");
            }
            else {   
                System.out.println("Form Submitted Successfully.");  
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}