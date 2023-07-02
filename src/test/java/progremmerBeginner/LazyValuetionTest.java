package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuetionTest {
    @Test
    void testIntermediatOpretion() {

        List<String> listName=List.of("wanda","wandi","wandu");
        Stream<String> streamUpper=listName.stream().map(names-> {
            System.out.println("change"+names+"touppcase");
            return names.toUpperCase();
        });

    }

    @Test
    void testTerminalOpretion() {
        List<String> listName=List.of("wanda","wandi","wandu");

        listName.stream()
                .map(names-> {
            System.out.println("change "+names+" touppcase");
            return names.toUpperCase();
        }).map(uppercase-> {
                    System.out.println("change "+uppercase+" to mr");
                    return "mr."+uppercase;
                }).forEach(mr->{
                    System.out.println(mr);
                });
    }
}
