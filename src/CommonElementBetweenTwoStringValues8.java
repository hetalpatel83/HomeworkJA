//To ﬁnd the common elements between two arrays (string values)
public class CommonElementBetweenTwoStringValues8
{
 public static void main(String[] args)
 {
  //Declare and assign string array
  String[] numArray1 = {"Circle","Square","Oval","Heart"};
  String[] numArray2 = {"Rectangle","Triangle","Circle","Oval","Heart","Square"};
 // Outer loop
  for(int i = 0; i < numArray1.length; i++)
  {
  for(int j = 0; j < numArray2.length; j++)
  {
  // inner loop
  if(numArray1[i].equals(numArray2[j]))
  {
  System.out.println(numArray1[i]);
  break;
  }
  }
 }
}
}
