import java.util.Scanner;

 //To enter array and sort the values in ascending order
public class SortTheValuesInAscendingOrder11
{ //Initialize array in main method
  public static void main(String[] args)
  {
  int [] arr = new int [] {9,7,0,3,8,6};
  int temp = 0;
 //Displaying elements of original array
   System.out.println("Enter array elements: ");
   for (int i = 0; i < arr.length; i++)
   {
   System.out.print(arr[i] + " ");
   }
 //Sort the array in ascending order
   for (int i = 0; i < arr.length; i++)
   {
   for (int j = i+1; j < arr.length; j++)
   {
   if(arr[i] > arr[j])
   {
   temp = arr[i];
   arr[i] = arr[j];
   arr[j] = temp;
   }
   }
   }
   System.out.println();
  //Displaying array elements after sorting
   System.out.println("Array Elements in Ascending Order: ");
   for (int i = 0; i < arr.length; i++)
   {
   System.out.print(arr[i] + " ");
   }
  }
}
