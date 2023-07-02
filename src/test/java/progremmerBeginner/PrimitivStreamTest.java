package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitivStreamTest {
    @Test
    void testPrimitiveCreat() {
        IntStream intStream = IntStream.range(0, 100);
        intStream.forEach(System.out::println);

        LongStream longStream=LongStream.of(1,2,3,4,5);

        DoubleStream doubleStream=DoubleStream.builder().add(0.1).add(23.2).build();
    }

    @Test
    void testOprations() {
        IntStream intStream = IntStream.range(0, 100);
        OptionalDouble optionalDouble=intStream.average();
        optionalDouble.ifPresent(System.out::println);

        IntStream.range(1,100)
                .mapToObj(number->"number : "+number)
                .forEach(System.out::println);

    }
}
