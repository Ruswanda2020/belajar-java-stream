package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOpretionTest {
    @Test
    void testStreamOpretion(){
        List<String> names =List.of("wanda","ruswanda","dirganta");

        Stream<String> stringStream=names.stream().map(name -> name.toUpperCase());
        stringStream.forEach(System.out::println);

        names.forEach(System.out::println);
    }
}
