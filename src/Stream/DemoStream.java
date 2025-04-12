package Stream;

import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {

    public static void main(String[] args) {
        //List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //System.out.println(arr);
        //Stream<Integer> stream = arr.stream();
        //System.out.println(stream);
        //System.out.println(arr.stream().filter((Integer i)->i%2==0).count());


        //// Creating Streams

        // 1. From Collections
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> stream = arr.stream();

        // 2. From Arrays
        String[] a = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(a);

        // 3. From Static method
        Stream<String> stream2 = Stream.of("a","b","c");

        // 4. Infinite Stream
        Stream.generate(()->1).limit(100);

        List<Integer> collect=Stream.iterate(50,x->x+1).limit(100).collect(Collectors.toList());
        System.out.println(collect);

        // 5. Stream Builder
        Stream.Builder<Integer> streambuilder = Stream.builder();
        streambuilder.add(1000).add(9000).add(3500);

        Stream<Integer> streamFromStreamBuilder = streambuilder.build();
        System.out.println(streamFromStreamBuilder);
    }
}
