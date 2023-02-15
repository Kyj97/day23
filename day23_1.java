import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class day23_1 {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        names.stream()
                .filter(x -> x.charAt(0) < '이')
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        names.stream()
                .sorted()
                .forEach(i -> System.out.print(i + " "));

        Optional<String> n = Optional.of(names.get(0));
        System.out.println();
        System.out.println(n);
        System.out.println(n.get());

        Stream<String> name = names.stream();
        System.out.println(name.count());







    }
}
