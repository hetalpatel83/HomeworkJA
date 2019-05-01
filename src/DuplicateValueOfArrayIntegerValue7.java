
// to ﬁnd the duplicate values of an array of integer values
 public class DuplicateValueOfArrayIntegerValue7
{
  public static void main(String[] args)
  {
    //Initialize array
    int [] arr = new int [] {1,2,3,3,5,2,7,1,9,5};
    System.out.println("Duplicate value of array integer number: ");
    //Searches for duplicate value
    for(int i = 0; i < arr.length; i++)
    {
      for(int j = i + 1; j < arr.length; j++)
      {
        if(arr[i] == arr[j])
          System.out.println(arr[j]);
      }
    }
  }
}
