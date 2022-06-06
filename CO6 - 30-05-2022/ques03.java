import java.io.*;
import java.util.*;

public class ques03 {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the source File Name");
        String source=sc.nextLine();
        
        try {
            FileReader fr=new FileReader(source);
            String str = "";
            int i;

            System.out.println("Reading from file "+source);
            while ((i = fr.read()) != -1)
                str += (char) i;

            System.out.println(str);
            System.out.println("\nEnter the filename to copy");
            String destination=sc.nextLine();
            
            File file=new File(destination);
            FileWriter fw = new FileWriter(file);
            fw.write(str);
            fr.close();
            fw.close();
            
            System.out.println("Copied from "+source+" to "+destination+ " Successfully..!");
        }
        catch (Exception e) {
            System.out.println("Exception Occured");
        }
        sc.close();
    }
}