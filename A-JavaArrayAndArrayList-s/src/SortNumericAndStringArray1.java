import java.util.Arrays;
 //To sort a numeric array and a string array
public class SortNumericAndStringArray1
{
   public static void main(String[] args){
      //Declare and assign int array
      int numbers[] = {1,7,3,9,2,11,154,13};

      //Declare and assign String array
      String name[] = {"Door","Windows","Floor","Ceiling","Sofa","Chair","Table"};

      //Print original int array
      System.out.println("Original numeric array : "+ Arrays.toString(numbers));

      //Sorting the int array
      Arrays.sort(numbers);

      //Print the sorted int array
      System.out.println("Sorted numeric array : "+Arrays.toString(numbers));

      //Print original string array
      System.out.println("Original string array : "+Arrays.toString(name));

      //Sorting the string array
      Arrays.sort(name);

      //Print the sorted string array
      System.out.println("Sorted string array : "+Arrays.toString(name));
   }
}
