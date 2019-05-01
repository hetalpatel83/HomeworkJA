import java.util.ArrayList;

//To clone an array list to another array list
public class CloneArraylistToAnotherArraylist14
{
  public static void main(String[] args)
   {
  //Create ArrayList object
   ArrayList arrayList = new ArrayList();
  //Add elements to ArrayList
   arrayList.add("One");
   arrayList.add("Two");
   arrayList.add("Three");
   //Print Actual ArrayList
   System.out.println("Actual ArrayList:"+arrayList);
   //Using clone() function
   ArrayList<String> copy = (ArrayList<String>) arrayList.clone();
   //Print Cloned ArrayList
   System.out.println("Cloned ArrayList:"+copy);
   }
}
