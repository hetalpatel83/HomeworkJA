import java.util.Scanner;

  //A 2-D array and to transpose a matrix
  //Row value should be transposed to column
  //and column value should be printed in row
public class TransposeAMatrix2DArray10
{
 public static void main(String args[]){
 //Creating original matrix
 int original[][]={{1,2,3},{4,5,6},{7,8,9}};
 //Creating another matrix to store transpose of a matrix
 //3 rows and 3 columns
 int transpose[][]=new int[3][3];
 //Code to transpose a matrix
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<3;j++)
 {
 transpose[i][j]=original[j][i];
 }
 }
 System.out.println("Printing Matrix before Transpose:");
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<3;j++)
 {
 System.out.print(original[i][j]+" ");
 }
 System.out.println();
 }
 System.out.println("Printing Matrix after Transpose:");
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<3;j++)
 {
 System.out.print(transpose[i][j]+" ");
 }
  System.out.println();
  }
  }
}