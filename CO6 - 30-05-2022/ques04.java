import java.io.*;

public class ques04 {
    public static void main(String[] args) {
        try {
            
            FileReader fr = new FileReader("numbers.txt");
            BufferedReader br = new BufferedReader(fr);
            File file1 = new File("oddnumbers.txt");
            FileWriter fw1 = new FileWriter(file1);
            File file2 = new File("evennumbers.txt");
            FileWriter fw2 = new FileWriter(file2);
            String num;
            
            while ((num = br.readLine()) != null) {
                if (Integer.parseInt(num) % 2 == 0)
                    fw2.write(num + "\n");
                else
                    fw1.write(num + "\n");
            }
            System.out.println("The seperate files of even and odd numbers are successfully created !!");
            fw1.close();
            fw2.close();
            br.close();
            }
            catch (Exception e) {
                System.out.println("Error");
            }
    }
}