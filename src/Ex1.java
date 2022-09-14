import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter","jan","john","janne","celine");

        //1
        names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1)).sorted(Comparator.reverseOrder());
        //      .forEach(System.out::println);

        //2
        names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted();
        //      .forEach(System.out::println);

        //3
        names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted(Comparator.reverseOrder());
        //      .forEach(System.out::println);

        //4
        String result = "Sorted names as String: " + names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
