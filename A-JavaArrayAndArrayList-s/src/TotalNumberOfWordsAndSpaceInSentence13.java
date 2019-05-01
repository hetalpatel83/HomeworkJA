
//To enter any String and count how many total number of words
//And total number of spaces in that sentence
public class TotalNumberOfWordsAndSpaceInSentence13
{
   public static void main(String args[])
   {
      //Assign initial value of word as 1
      int word=1;
      String str="count number of words and spaces in sentence";
      for(int i=0;i<str.length();++i)
      {
         if(str.charAt(i)==' ')word++;
      }
      //Print number of words
      System.out.println("Number of words="+word);
      //Print number of spaces
      System.out.println("Number of spaces="+(word-1));
   }
}
