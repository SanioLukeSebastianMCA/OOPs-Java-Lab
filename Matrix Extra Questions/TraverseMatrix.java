import java.util.*;

class TraverseMatrix{
    public static void main(String[] args){
        //System.out.println("Hello Traverse Matrix Class");

        int row, col;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of rows wanted : ");
        row= sc.nextInt();
        System.out.print("\nEnter the number of columns wanted : ");
        col= sc.nextInt();

        int[][] matrix= new int[row][col];

        System.out.println("Enter the elements for the matrix : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println("\nThe entered matrix is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println("\n");
        }

        sc.close();
    }
}