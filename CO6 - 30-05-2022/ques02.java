import java.io.*;
import java.util.*;

public class ques02 {
    public static void main(String[] args) {

        String var = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the text to create file. (NOTE: Enter/Click ENTER-key 3 times to stop and save)");
        
        while (!var.endsWith("\n\n\n"))
            var = var + sc.nextLine() + "\n";
        try {
            File file = new File("output.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(var);
            fw.close();
            System.out.println("Reading File content");
            
            FileReader fr = new FileReader("output.txt");
            String str = "";
            int i;
            
            while ((i = fr.read()) != -1)
                str += (char) i;
            System.out.println(str);
            fr.close();
        }
        catch (IOException e) {
            System.out.println("There are some exception");
        }

        sc.close();
    }
}
