import java.io.File;
import java.util.*;
import java.io.*;

public class FileDirectory {

    public static final String RED = "\033[0;31m";
    public static final String RESET="\033[0m";

    static void RecursivePrint(File[] arr, int index, int level, String searchfor) {
        if (index == arr.length)
            return;
        for (int i = 0; i < level; i++)
            System.out.print("\t");
        if(arr[index].getName().toLowerCase().contains(searchfor))
            System.out.print(RED);
        else
            System.out.print(RESET);
        if (arr[index].isFile())
            System.out.println(arr[index].getName());
        else if (arr[index].isDirectory()) {
            System.out.println("[" + arr[index].getName() + "]");
            RecursivePrint(arr[index].listFiles(), 0, level + 1, searchfor);
        }
        RecursivePrint(arr, ++index, level, searchfor);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the directory path");
        String maindirpath = scan.nextLine();
        System.out.println("Enter the file/directory name to search");
        String searchfor = scan.nextLine();
        File maindir = new File(maindirpath);
        if (maindir.exists() && maindir.isDirectory()) {
            File arr[] = maindir.listFiles();
            System.out.println("#################################################");
            System.out.println("Files from main directory" + maindir);
            System.out.println("#################################################");
        }
    }
}