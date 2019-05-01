import java.util.ArrayList;
import java.util.List;

//To replace a particular element in an ArrayList with the given element
public class ReplaceParticularElement18
{
    public static void main(String[] args) {
        //create an arrayList and object
        List<String> subject = new ArrayList<String>();
        //Add elements to arraylist
        subject.add("Maths");
        subject.add("English");
        subject.add("Science");
        subject.add("Eco");
        subject.add("History");
        //Print arraylist before replace
        System.out.println("ArrayList before replace:"+ subject);
        //Replace the element
        subject.set(1,"Geography");
        //Print arraylist after replace
        System.out.println("ArrayList after replace" + subject);
    }
}
