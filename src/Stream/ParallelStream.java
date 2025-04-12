package Stream;

import java.util.List;
import java.util.stream.Stream;
import java.lang.Math;

public class ParallelStream {
    public static void main(String[] args) {
        // A type of stream that enables parallel processing of elements
        // Allowing multiple threads to process parts of stream simultaneously
        // This can significantly improve performance for large data sets
        // workload is distributed across multiple threads

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1,x->x+1).limit(20000).toList();
        List<Long> factorialsList = list.stream().map(x->factorial(x)).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with stream: "+(endTime-startTime)+" ms");

        startTime = System.currentTimeMillis();
        list = Stream.iterate(1,x->x+1).limit(20000).toList();
        factorialsList = list.parallelStream().map(x->factorial(x)).toList();endTime = System.currentTimeMillis();
        System.out.println("Time taken with Parallel Stream: "+(endTime-startTime)+" ms");

    }

    public static long factorial(int n){
        long res =1;
        for(int i=2;i<=n;i++) res*=i;

        return res;
    }
}
