import java.util.Arrays;
import java.util.Scanner;

//To insert an element (speciﬁc position) into an array
public class InsertAnElement5
{
    public static void main(String args[])
    {
        //Declare and assign integer array
        int a[] = {1,5,7,9,10,13};
        int position, element;

        //Create Object
        Scanner scanner = new Scanner(System.in);

        //Print given Original Array
        System.out.println("Original Array:");
        //System.out.println(Arrays.toString(a));

        for(int i : a)
        {
            System.out.print(i + " ");
        }

        System.out.println("\n\nEnter element to insert:");
        element = scanner.nextInt();

        System.out.println("Enter position of element:");
        position = scanner.nextInt();

        int b[] = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, position - 1);

        b[position - 1] = element;
        System.arraycopy(a, position - 1, b, position, a.length - position + 1);
        System.out.println("Array After Insertion:");
        for(int i : b)
        {
            System.out.print(i + " ");
        }
    }
}
