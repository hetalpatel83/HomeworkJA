import java.util.Arrays;

//To test the equality of two arrays
public class TestTheEqualityOfTwoArrays9
{
 public static void main(String args[])
 {
  //Declare and assign integer arrays
  int[] FirstArray = {1,2,3,5};
  int[] SecondArray = {1,2,3,5};
  //Using if else to check equality of first and second array
  if (Arrays.equals(FirstArray, SecondArray))
   //Print arrays are equal
  System.out.println("Arrays are equal");
  //Print arrays are not equal
  else System.out.println("Arrays are not equal");

 }
}
