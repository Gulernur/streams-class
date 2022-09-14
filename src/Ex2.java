import java.util.stream.IntStream;

public class Ex2 {

    public static void main(String[] args) {

        // 1. What's the total amount of numbers in the stream (20 or 21)?
        System.out.println(IntStream.range(1, 21).count());

        // 2. What's the total of all the numbers?
        System.out.println(IntStream.range(1, 21).sum());

        // 3. What's the average value of all the numbers?
        System.out.println(IntStream.range(1, 21).average().getAsDouble());

        //4. Raise all numbers to the power of two and print the first 6 numbers
        IntStream.range(1, 21)
                .map(n -> n*n)
                .limit(6)
                .forEach(System.out::println);

        //5. Raise all numbers to the power of two, and print all the even numbers
        IntStream.range(1, 21)
                .map(n -> n*n)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
