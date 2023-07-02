package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {
    @Test
    void testCrestPipelineTest() {

        //jarang di gunakan cara seperti ini
        List<String> stringList=List.of("wanda","dirgantara","kumolowongso");
        Stream<String> stringStream=stringList.stream();

        Stream <String> streamUpper=stringStream.map(nama ->nama.toUpperCase());

        Stream<String> streamMr=streamUpper.map(upper ->"mr."+upper);
        streamMr.forEach(System.out::println);
    }

    @Test
    void tesTCreatStreamPipline() {
        List<String> stringList=List.of("wanda","dirgantara","kumolowongso");
        stringList.stream()
                .map(name->name.toUpperCase())
                .map(upper->"Mr."+upper)
                .forEach(System.out::println);

        //stream pipline
    }
}
