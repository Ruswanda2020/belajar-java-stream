package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformetionOpretionTest {
    @Test
    void testMap() {
        List.of("wanda","dirgantara","ardiningrat").stream()
                .map(uppercase->uppercase.toUpperCase())
                .map(lenght->lenght.length())
                .forEach(length-> System.out.println(length));
    }

    @Test
    void testFlatMap() {
        List.of("wanda","dirgantara","ardiningrat").stream()
                .map(uppercase->uppercase.toUpperCase())
                .flatMap(upper-> Stream.of(upper,upper.length()))
                .flatMap(value->Stream.of(value,value,value))
                .forEach(length-> System.out.println(length));
    }
}
