package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.Math;
public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(x-> System.out.println(x));

        // 3. reduce : Combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce((x,y)->x+y);
        System.out.println(optionalInteger.get());

        // 4. count
        list.stream().filter(x->x%2==0).count();

        // 5. anymatch, allmatch, nonematch
        boolean b = list.stream().anyMatch(x->x%2==0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x->x>0);
        System.out.println(b1);

        System.out.println(list.stream().noneMatch(x->x<0));

        // 6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        // Examples
        // need to find out the strings having length more than 3
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x->x.length()>3).collect(Collectors.toList()));

        // Example : Squaring and sorting numbers
        List<Integer> numbers = Arrays.asList(5,2,9,1,6);
        System.out.println(numbers.stream().map(x->Math.pow(x,2)).sorted().toList());

        // Ex: Summing values
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        System.out.println(numbers1.stream().reduce((x,y)->x+y).get());

        // Ex: Counting Occurances of a Character
        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(x->x=='l').count());




    }
}
