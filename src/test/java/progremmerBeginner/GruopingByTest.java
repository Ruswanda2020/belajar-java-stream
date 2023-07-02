package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GruopingByTest {
    @Test
    void testGroupingBy() {
        Map<String, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(number -> number > 5 ? "Besar" : "Kecil"));
        System.out.println(collect);
    }
    @Test
    void testGroupingBy2() {
        Map<String, List<String>> map = Stream.of("wanda ajudan ", "jokowii", "ahmad sahroni", "niaga hostar","eko","naim")
                .collect(Collectors.groupingBy(name -> name.length() > 5 ? "Panjang" : ""));
        System.out.println(map);

    }
    @Test
    void testPartioningBy() {
        Map<Boolean, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(number ->{
                return number > 5;
                }));
        System.out.println(collect);
    }
    @Test
    void testPartioningBy2() {
        Map<Boolean, List<String>> map = Stream.of("wanda ajudan ", "jokowii", "ahmad sahroni", "niaga hostar","eko","naim")
                .collect(Collectors.groupingBy(name -> {
                    return name.length() > 4;
                }));
        System.out.println(map);

    }
}
