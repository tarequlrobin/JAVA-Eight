import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIImpl {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        Stream<String> stream = list.stream();
        //stream.forEach(System.out::println);

        String [] strings = {"bat", "tan", "eat", "tea",  "ate", "nat"};
        Stream<String> stringsStream = Arrays.stream(strings);
        //stringsStream.forEach(System.out::println);

        //Stream.of(list).forEach(System.out::print);

        Stream <Integer> integerStream = Stream.iterate(1, n-> n+1).limit(list.size());
        integerStream.forEach(System.out::println);

        Stream.generate(()->"peace").limit(list.size()).forEach(System.out::println);


    }
}
