import java.util.Comparator;
import java.util.stream.Stream;

public class Ex3 {

    public static void main(String[] args) {
        Stream<Integer> numberStream = Stream.of(2,5,8,6,77,34,23,78,99,12);

        //1. Print out all numbers sorted ascending.
        numberStream.sorted(Comparator.naturalOrder()).forEach(System.out::println);

        //2. Print out all numbers sorted descending.
        numberStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //3. Print out all EVEN numbers sorted ascending.
        numberStream.sorted(Comparator.naturalOrder()).filter(n -> n % 2 == 0).forEach(System.out::println);

        //4. Print out all EVEN numbers sorted ascending but skip the first 5 numbers
        numberStream.sorted(Comparator.naturalOrder()).skip(5).forEach(System.out::println);

        //5. Print out the max number
        System.out.println(numberStream.max(Comparator.naturalOrder()).get());
    }
}
