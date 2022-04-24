import java.util.*;

class Employee{
    
    int eno, esalary;
    String ename;

    Employee(){  }

    Employee(int eno, String ename, int esalary){
        this.eno= eno;
        this.ename= ename;
        this.esalary= esalary;
    }
}

public class ArrayObjects {

    private boolean searchEmp(Employee[] arr, int sempno){
        boolean isfound= false;
        
        for(int i=0;i<arr.length;i++){
            if(sempno==arr[i].eno){
                isfound=true;
                break;
            }
        }
        return isfound;
    }
    public static void main(String[] args){
        
        int size, search_emp;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of employees that you want to list : ");
        size= sc.nextInt();

        Employee[] emps= new Employee[size];
        for(int i=0;i<size;i++){
            Employee emp= new Employee();

            System.out.print("Enter the number for the employee "+(i+1)+": ");
            emp.eno= sc.nextInt();

            System.out.print("Enter the name for the employee "+(i+1)+": ");
            emp.ename= sc.next();

            System.out.print("Enter the salary for the employee "+(i+1)+": ");
            emp.esalary= sc.nextInt();

            emps[i]= emp;

            System.out.println("\n");
        }

        System.out.print("Enter the emp no of the employee that you want to search : ");
        search_emp= sc.nextInt();
        

        ArrayObjects inst= new ArrayObjects();
        String res= inst.searchEmp(emps, search_emp) ? " is found / available." : " is not found / not available";
        System.out.println("The searched employee with the emp no "+search_emp+res);

        sc.close();
    }
}