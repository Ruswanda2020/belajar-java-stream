package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOpretionTest {
    @Test
    void testSorted() {
        List.of("wanda","dika","aldo","cahya","pirmansyah").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> comparator=Comparator.reverseOrder();
        List.of("wanda","dika","aldo","cahya","pirmansyah").stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
}
