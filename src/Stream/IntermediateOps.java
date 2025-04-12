package Stream;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args){
        // Intermediate operations transform stream to another stream
        // They are lazy, i.e they don't execute until terminal operation is invoked

        // 1.filter
        List<String> list = Arrays.asList("Akhil","Anil","Anurag","Borx","Doreamon","Nobita");
        long n = list.stream().filter(x->x.toLowerCase().startsWith("a")).count();
        System.out.println(n);
        Stream<String> filteredStream = list.stream().filter(x->x.toLowerCase().startsWith("a"));
        List<String> filteredList = filteredStream.collect(Collectors.toList());
        System.out.println(filteredList);


        // 2. map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // 3. sorted
        list.stream().sorted();
        list.stream().sorted((a,b)->a.length()-b.length()); // sort based on length

        // 4.distinct
        list.stream().filter(x->x.startsWith("a")).distinct().count();

        // 5. limit
        Stream.iterate(1, x->x+1).limit(100);

        // 6. skip
        Stream.iterate(1,x->x+1).skip(10).limit(100).count();
    }
}
