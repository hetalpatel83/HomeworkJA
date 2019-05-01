import java.util.Arrays;

//To compare two array lists
public class CompareTwoArrayLists15
{
    public static void main (String[] args)
    {
        //Declare and assign two integer array lists
       int arr1[] = {1, 2, 3};
       int arr2[] = {1, 2, 3};

       //Compare given arraylists are same or not
       if (Arrays.equals(arr1, arr2))

           //Print array lists Same
           System.out.println("Same");
       else
           //Print array lists Not Same
           System.out.println("Not same");
   }
}
