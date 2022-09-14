import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex4 {

    public static void main(String[] args) throws IOException {

        //1. What's the total number of approved names for boys?
        System.out.println(Files.lines(Paths.get("drengenavne.txt")).count());

        //2. What's the total number of approved names for girls?
        System.out.println(Files.lines(Paths.get("pigenavne.txt")).count());

        //3. Print the first 10 boy names starting with "P".

        //4. How many boy names starts with "P"?

        //5. Print "all" boy names starting with "P", but skip the first 400.

        //6. How many names includes "Peter" as part of the name  (Use "Anna" for girls)?

        //7. How many names includes "peter" as part of the name (Use "anna" for girls)?

        //8. How many names includes "Peter" or "peter" as part of the name (Use "Anna" or "anna" for girls)?

        //9. Print all the names above ("Peter" and "peter") (or "Anna" and "anna") with their original casing.

        //10. What's the longest approved boy name (use  reduce)?
    }
}
