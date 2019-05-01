import java.util.Scanner;

//To enter any String and count total number of 'a' in that String
public class CountTotalNumberOfaInString12
{
  public static void main(String args[]){

    //Created a Scanner object
    Scanner scanner = new Scanner(System.in);

    //Pint a string
    System.out.println("Enter a string");

    char ch ='a';
    int count;
    String inputString = scanner.nextLine();
    inputString = inputString.toLowerCase();

    //Initialize count array index
    count = 0;
    for (int i = 0; i < inputString.length(); i++)
    {
      //Checking character in string
      if (inputString.charAt(i) == ch)
      {
        count++;
      }
    }
    System.out.println("Number of occurences of " + ch + " is " + count);
  }
}
