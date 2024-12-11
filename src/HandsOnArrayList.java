import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {
public void ArrayListDemo(){
        ArrayList<String> students = new ArrayList<>();
        students.add("John");
        students.add("Jane");
        students.add("Bob");
        students.add("Mary");
        students.add("Jack");
        // Print the list of names
        System.out.println("The Original list of the Students:"+students);
        //Remove a name and print the updated list
        students.remove("John");
        System.out.println("Removed John from list: "+students);
        // Sort the list alphabetically and print the sorted list.
        Collections.sort(students);
        System.out.println("The Sorted list of Students:"+students);
    }
}
