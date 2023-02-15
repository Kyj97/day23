import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class day23_2 {
    public static void main(String[] args) {
        enum Gender {남, 여}
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);


//        Stream<Integer> age = ages.stream();
        int age = ages.stream().reduce(0, (a, b) -> a + b);
        System.out.println(age);

        Stream<Integer> age2 = ages.stream();
        System.out.println(age2.max(Comparator.comparing(x -> x)).get());


        Stream<Integer> age3 = ages.stream();
        double age4 = age3.mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(age4);




    }
}
