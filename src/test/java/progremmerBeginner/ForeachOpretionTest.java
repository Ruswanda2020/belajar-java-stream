package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForeachOpretionTest {
    @Test
    void testPeekBefore() {
        List.of("alif","joko","dika","pirmansyah","ruswanda").stream()
                .map(name->{
                    System.out.println("before change name to upper: "+name);
                    String upper= name.toUpperCase();
                    System.out.println("change name after "+upper);
                    return upper;
                })
                .forEach(name-> System.out.println("final name :"+name));
    }

        @Test
        void testPeekAfter() {
            List.of("alif","joko","dika","pirmansyah","ruswanda").stream()
                    .peek(nama->System.out.println("before change name to upper: "+nama))
                    .map(upper-> upper.toUpperCase())
                    .peek(name -> System.out.println("change name to upper: "+ name))
                    .forEach(upper-> System.out.println("final name "+upper));


        }
}

