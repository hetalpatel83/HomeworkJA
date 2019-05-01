import java.util.ArrayList;

//To ﬁnd the index of an array element
public class FindIndexOfArrayElement4
{
    public static void main(String[] args)
    {
        //Create an ArrayList object
        ArrayList arrList = new ArrayList();

        //Adding elements in the Arraylist object
        arrList.add("1");
        arrList.add("2");
        arrList.add("3");
        arrList.add("4");
        arrList.add("5");

        //Searching element 3 from given list
        int index = arrList.indexOf("3");

        //Now check the index
        if(index == -1)
            //Print if the element is not found
            System.out.println("Element is not found in the list");
        else
            //Print the element found at index
            System.out.println("Element found at index: " + index);
    }
}
