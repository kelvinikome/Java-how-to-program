/* he lambda you pass to a
stream’s reduce method should be associative—that is, regardless of the order in which its subexpres-
sions are evaluated, the result should be the same. The lambda expression in lines 34–36 of Fig. 17.5
is not associative. If you were to use parallel streams (Chapter 23, Concurrency) with that lambda,
you might get incorrect results for the sum of the squares, depending on the order in which the sub-
expressions are evaluated. The proper way to implement lines 34–36 would be first to map each int
value to the square of that value, then to reduce the stream to the sum of the squares. Modify
Fig. 17.5 to implement lines 34–36 in this manner. */

import java.util.Arrays;
import java.util.stream.IntStream;
public class MappingIntStreamParallelization
{
    public static void main(String[] args)
    {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        // display original values
        System.out.print("Original values: ");
        IntStream.of(values)
        .forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        // count, min, max, sum and average of the values
        System.out.printf("%nCount: %d%n", IntStream.of(values).count() );
        System.out.printf("Min: %d%n",
        IntStream.of(values).min().getAsInt() );
        System.out.printf("Max: %d%n",
        IntStream.of(values).max().getAsInt() );
        System.out.printf("Sum: %d%n", IntStream.of(values).sum() );
        System.out.printf("Average: %.2f%n",
        IntStream.of(values).average().getAsDouble() );
        // sum of values with reduce method
        System.out.printf("%nSum via reduce method: %d%n",
        IntStream.of(values)
        .reduce(0, (x, y) -> x + y) );
        // sum of squares of values with reduce method
        System.out.printf("Sum of squares via reduce method: %d%n",
        IntStream.of(values)
        .reduce(0, (x, y) -> x + y * y) );
        // product of values with reduce method
        System.out.printf("Product via reduce method: %d%n",
        IntStream.of(values)
        .map(x -> x * x)
        .map( y -> y * y)
        .reduce(1, (x, y) -> x * y) );
        // even values displayed in sorted order
        System.out.printf("%nEven values displayed in sorted order: ");
        IntStream.of(values)
        .filter(value -> value % 2 == 0)
        .sorted()
        .forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        // odd values multiplied by 10 and displayed in sorted order
        System.out.printf(
        "Odd values multiplied by 10 displayed in sorted order: ");
        IntStream.of(values)
        .filter(value -> value % 2 != 0)
        .map(value -> value * 10)
        .sorted()
        .forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        // sum range of integers from 1 to 10, exlusive
        System.out.printf("%nSum of integers from 1 to 9: %d%n",
        IntStream.range(1, 10).sum() );
        // sum range of integers from 1 to 10, inclusive
        System.out.printf("Sum of integers from 1 to 10: %d%n",
        IntStream.rangeClosed(1, 10).sum() );
    }
} // end class IntStreamOperations