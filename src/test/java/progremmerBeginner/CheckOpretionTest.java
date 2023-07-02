package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOpretionTest {
    @Test
    void testAnyMetch() {
     boolean macth=List.of(1,2,3,4,5,6,56,3,34,33).stream()
                .anyMatch(number ->number > 50);
        System.out.println(macth);

    }
    @Test
    void testAllMetch() {
        boolean macthAll=List.of(1,2,3,4,5,6,56,3,34,33).stream()
                .allMatch(number ->number > 0);
        System.out.println(macthAll);

    }

    @Test
    void testNonMetch() {
        boolean macthAll=List.of(1,2,3,4,5,6,56,3,34,33).stream()
                .noneMatch(number ->number > 70);
        System.out.println(macthAll);

    }
}
