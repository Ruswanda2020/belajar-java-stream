package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatStreamTest {
    @Test
    void testCreatEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);
        Stream<String> singleStream = Stream.of("wanda");
        singleStream.forEach(System.out::println);

        String data = "wandi";
        Stream<String> nullableStream = Stream.ofNullable(data);
        nullableStream.forEach(System.out::println);

    }

    @Test
    void testCreatFromArrays() {
        Stream<String> arrayStream = Stream.of("wanda", "dirgantara", "kurniawan");
        arrayStream.forEach(System.out::println);
        Stream<Integer> integerstream = Stream.of(1, 2, 3, 5, 7, 3, 6, 7);
        integerstream.forEach(System.out::println);

        String[] arr=new String[]{
               "wanda" ,"pirmansyah","dika","alvito"
        };

        Stream<String> arrayToStream= Arrays.stream(arr);
        arrayToStream.forEach(System.out::println);
    }

    @Test
    void testStreamFromColletion() {

        List<String>stringCollections = List.of("wanda","dirgantara");

        Stream<String> stringStream1=stringCollections.stream();
        stringStream1.forEach(System.out::println);

        Stream<String> stringStream2=stringCollections.stream();
        stringStream2.forEach(System.out::println);
    }

    @Test
    void testCreatInfiniteStream() {

        Stream<String> stringStream=Stream.generate(()->"wanda");
        //stringStream.forEach(System.out::println);
        Stream<Integer> integerStream=Stream.iterate(1,valu -> valu+1);
        //integerStream.forEach(System.out::println);
    }
}
