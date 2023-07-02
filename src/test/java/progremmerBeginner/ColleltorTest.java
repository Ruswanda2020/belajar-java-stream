package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ColleltorTest {

    Stream<String> getStream(){
        return Stream.of("wanda","wandai","arhan","rehan");
    }
    @Test
    void testStreamToColletion() {
        Set<String> set =getStream().collect(Collectors.toSet());
        System.out.println(set);
        Set<String> unmodifiableset=getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(unmodifiableset);

        List<String> list=getStream().collect(Collectors.toList());
        System.out.println(list);
        List<String> unModifiableList=getStream().collect(Collectors.toUnmodifiableList());
        System.out.println(unModifiableList);
    }

    @Test
    void testMap() {
        Map<String,Integer> map=getStream().collect(Collectors.toMap(
                key->key,
                value->value.length()
        ));
        System.out.println(map);
    }
}
