package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOpretionTest {
    @Test
    void testLimit() {
        List.of("wanda","dika","pirmansyah","alvito","rosal madani").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("wanda","dika","pirmansyah","alvito","rosal madani").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void TestTakeWhile() {
        List.of("wanda","dika","pirmansyah","alvito","rosal madani").stream()
                .takeWhile(name->name.length()<=5)
                .forEach(System.out::println);
    }
    @Test
    void TestDropWhile() {
        List.of("wanda","dika","pirmansyah","alvito","rosal madani").stream()
                .dropWhile(name->name.length()<=5)
                .forEach(System.out::println);
    }
    @Test
    void testFindAny() {
      Optional<String> optionalS=List.of("wanda","dika","pirmansyah","alvito","rosal madani").stream()
              .findAny();
              optionalS.ifPresent(name->{
               System.out.println(name);
              });
    }
    @Test
    void testFinFirst() {
        Optional<String> optionalS=List.of("wanda","dika","pirmansyah","alvito","rosal madani").stream()
                .findFirst();
        optionalS.ifPresent(name->{
            System.out.println(name);
        });
    }
}
