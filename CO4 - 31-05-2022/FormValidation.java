import java.util.Scanner;

class CustomFormException extends Exception{
    public CustomFormException(String errorMessage){
        super(errorMessage);
    }
}

public class FormValidation {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            String username, password;
    
            System.out.println("Enter the username : ");
            username= sc.next() + sc.next();
    
            System.out.println("Enter the password : ");
            username= sc.next();
    
            try {
                if(username==null && username==" "){  
                throw new CustomFormException("The Username is empty !! Cannot be empty !! Please fill.");    
                }
                else if(password==null && password==" "){  
                throw new CustomFormException("The password is empty !! Cannot be empty !! Please fill.");    
                }
                else {   
                    System.out.println("Form Submitted Successfully.");   
                } 
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}