package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOpretionTest {
    @Test
    void testFilteringOpretion() {
        List.of("ruswanda","alif","joko","dika","pirmansyah").stream()
                .filter(name->name.length()>5)
                .forEach(System.out::println);
        List.of(1,2,3,4,5,6,7,8,9,22).stream()
                .filter(number->number % 2 ==0)
                .forEach(System.out::println);
    }
    @Test
    void testDistinct() {
        List.of("ruswanda","alif","joko","dika","pirmansyah","alif","ruswanda").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
