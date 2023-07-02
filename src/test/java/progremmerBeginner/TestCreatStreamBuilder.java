package progremmerBeginner;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.stream.Stream;

public class TestCreatStreamBuilder {


    @Test
    void testStreamBuilder() {

        Stream.Builder<String> builder=Stream.builder();
        //cara pertama memasukan data
        builder.accept("wanda");
        //cara kedua mengunakan balikan nya builder itu sendiri
        builder.add("wanda").add("dirgantara");

        Stream<String> stream=builder.build();
        stream.forEach(System.out::println);
        
    }

    @Test
    void testStreamBuilderSimplify(){
        Stream<Object> stream=Stream.builder().add("wanda").add("dirgantara")
                .add("kumolowongso").build();

        stream.forEach(System.out::println);
    }
}
