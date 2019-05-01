
//To test if an array contains a speciﬁc value
public class ContainsSpecificValue3
{
  //Declare assign integer name
  public static boolean contains(int[] arr, int item)
  {
    //Using for loops to check condition
    for (int n : arr)
    {
      //Checking condition is True or false
      if (item == n)
      {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args)
  {
    //Declaring and initializing array
    int[] myArray = { 5, 2, 17, 13, 12, 19, 7, 3, 9, 15 };

    //Test the contains functions by passing number which is not in array
    System.out.println(contains(myArray, 25));

    //Test the contains functions by passing number which is part of array
    System.out.println(contains(myArray, 13));
  }

}
