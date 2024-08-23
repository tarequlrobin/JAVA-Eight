import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIImpl {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        String [] strings = {"bat", "tan", "eat", "tea",  "ate", "nat"};
        Stream<String> stringsStream = Arrays.stream(strings);
        stringsStream.forEach(System.out::println);

        Stream.of(list).forEach(System.out::print);

        Stream <Integer> integerStream = Stream.iterate(1, n-> n+1).limit(list.size());
        integerStream.forEach(System.out::println);

        Stream.generate(Math::random).limit(list.size()).forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(9,55,34,78,2,0,98,4,29,78,2,0,98,44);
        integerList
                .stream()
                .filter(n -> n % 2 == 0)
                .toList()
                .stream()
                .map(n -> n/2)
                .toList()
                .stream()
                .distinct()
                .sorted((x,y) -> y-x)
                .forEach(System.out::println);
    }
}