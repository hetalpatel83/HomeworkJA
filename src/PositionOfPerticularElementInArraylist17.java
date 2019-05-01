import java.util.ArrayList;

//To get the position of a particular element in an ArrayList
public class PositionOfPerticularElementInArraylist17
{
    public static void main(String[] args)
    {
   //Creating integer ArrayList
   ArrayList<Integer> arr = new ArrayList<Integer>(4);
   //To initialize values
   arr.add(10);
   arr.add(20);
   arr.add(30);
   arr.add(40);
   //Print arraylist
   System.out.println("ArrayList: " + arr);
   //Find the integer value at index 0
   int element = arr.get(0);
   //Print the element at index 0 is element 10
   System.out.println("the element at index 0 is " + element);
   }
}
