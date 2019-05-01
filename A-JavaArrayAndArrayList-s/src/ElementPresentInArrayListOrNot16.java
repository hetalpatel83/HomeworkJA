import java.util.ArrayList;

//To check whether the given element is present in an ArrayList or not
public class ElementPresentInArrayListOrNot16
{
   public static void main(String[] args)
   {
      //Creating integer arrayList and initalise with capacity
      ArrayList<Integer> arr = new ArrayList<Integer>(4);

      // using add() to initialize values [1, 2, 3]
      arr.add(1);
      arr.add(2);
      arr.add(3);

      //Use contains() to check if the element 3 exits or not
      boolean ans = arr.contains(3);
      if (ans)
      {
         System.out.println("element 3 is present in an ArrayList");
      }
      else
      {
         System.out.println("element 3");
      }

      //Use contains() to check if the element 7 exits or not
      ans = arr.contains(7);
      if (ans)
      {
         System.out.println("element 7");
      }
      else
      {
         System.out.println("element 7 is not present in an ArrayList");
      }
   }
}

