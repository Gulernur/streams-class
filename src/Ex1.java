import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter","jan","john","janne","celine");

        //1. Create or print a list with the same size, but with each name capitalised (Peter, Jan ...)
        names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1)).sorted(Comparator.reverseOrder());
        //      .forEach(System.out::println);

        //2. Change the list above so that all items are sorted alphabetically
        names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted();
        //      .forEach(System.out::println);

        //3. Change the list above so that all items are sorted in the reverse order
        names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted(Comparator.reverseOrder());
        //      .forEach(System.out::println);

         /* 4. Change the example above to return a single string, like this:
         "Sorted names as String : Peter,John,Janne,Jan,Celine"
         */
        String result = "Sorted names as String: " + names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
