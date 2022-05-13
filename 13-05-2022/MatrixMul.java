import java.util.*;

public class MatrixMul {

    public int[][] MatrixCreation(){

        int row=0,col=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        row= sc.nextInt();

        System.out.print("\nEnter the number of columns : ");
        col= sc.nextInt();

        int[][] matrix= new int[row][col];
        System.out.println("Enter the elements for the matrix : ");
        for(int i=-0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        sc.close();
        return matrix;
    }

    public void matrixDisplay(int[][] matrix){

        if(matrix!=null && matrix.length > 0 && matrix[0].length > 0){
            int row= matrix.length;
            int col= matrix[0].length;

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(matrix[i][j]+"  ");
                }
                System.out.println("\n");
            }
        }
        else{
            System.out.println("This matrix is empty or not created !! Create a matrix and then try to display !!");
        }
    }

    public void matrixMultiplication(int[][] matA, int[][] matB){
        
        int r1= matA.length;
        int c1= matA[0].length;
        int r2= matB.length;
        int c2= matB[0].length;

        if((matA!=null && r1 > 0 && c1 > 0) && (matB!=null && r2 > 0 && c2 > 0)){

            
            int[][] finalmatrix= new int[r1][c2];

            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    finalmatrix[i][j]=0;
                    for(int k=0;k<c2;k++){
                        finalmatrix[i][j]+= matA[i][k]*matB[k][j]; 
                    }
                }
            }
    
            System.out.println("The final resultant matrix is : ");
            new MatrixMul().matrixDisplay(finalmatrix);
        }
        else{
            System.out.println("The given matrices are either empty or not created !! Make sure that both the matrices are created with proper values before multliplication !!");
        }
    }

    public static void main(String[] args){

        MatrixMul matrixMul= new MatrixMul();
        Scanner sc= new Scanner(System.in);
            
        int[][] matrix_01= new int[0][0];
        int[][] matrix_02= new int[0][0];

        matrix_01= matrixMul.MatrixCreation();
        matrix_02= matrixMul.MatrixCreation();

        System.out.println("The matrix A is : ");
        matrixMul.matrixDisplay(matrix_01);

        System.out.println("\nThe matrix B is : ");
        matrixMul.matrixDisplay(matrix_02);

        if(matrix_01[0].length==matrix_02.length){
            matrixMul.matrixMultiplication(matrix_01, matrix_02);
        }
        else{
            System.out.println("Matrix Multiplication not possible with these two matrices !! Please make sure the rows and columns are appropiate fro the multliplication.");
        }
    
        sc.close();
    }
}
