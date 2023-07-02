package progremmerBeginner;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AgregatOpretionTest {
    @Test
    void testMax() {
        List.of("ruswanda","alif","joko","dika","pirmansyah","alif","ruswanda").stream()
                .max(Comparator.naturalOrder())
                //.max(Comparator.reverseOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("alif","joko","dika","pirmansyah","ruswanda").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
     long count=List.of("alif","joko","dika","pirmansyah","ruswanda").stream()
                .count();
        System.out.println(count);
    }

    @Test
    void testSum() {
     var result=List.of(1,2,3,4,5).stream()
                .reduce(0,(valu,item)->valu+item);
        System.out.println(result);

        //0
        //1.valu=0 ,item=1 =1
        //2.valu=1 ,item=2 =3
        //3.valu=3,item=3 =6
        //4.valu= 6 ,item4=10
        //5.valu=10,item=5 =15

    }

    @Test
    void testFactorial() {
        var factorial=List.of(1,2,3,4,5).stream()
                .reduce(1,(valu,item)->valu*item);
        System.out.println(factorial);

        //
        //1.valu=1 ,item=1 =1
        //2.valu=1 ,item=2 =2
        //3.valu=2,item=3 =6
        //4.valu= 6 ,item4=24
        //5.valu=24,item=5 =120


    }
}
