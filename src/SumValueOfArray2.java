
 //To sum values of an array
public class SumValueOfArray2
{
  public static void main(String[] args)
  {
    //Declare and assign int array
    int a[] = {3,4,5,2,1,0,7};

    //Initialize a variable sum's value
    int sum = 0;

    //Use a loop to find the sum of all numbers in the array a
    for (int i : a)
    {
      sum += i;
    }
    //Print the total integer sum value
    System.out.println("Sum value is " + sum);
  }
}
