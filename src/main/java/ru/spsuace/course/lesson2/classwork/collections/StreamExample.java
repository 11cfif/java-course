package ru.spsuace.course.lesson2.classwork.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void create() {
        DoubleStream rundomNumbers = DoubleStream.generate(Math::random);
        IntStream integers = IntStream.iterate(0, n -> n + 1);
        IntStream smallIntegers = IntStream.range(0, 100);
        IntStream concat = IntStream.concat(integers, smallIntegers);
        IntStream my = IntStream.of(1, 4, 6, 7, 10);
        Stream<String> empty = Stream.empty();
    }

    public static void main(String[] args) {
        example(Arrays.asList("Alex", "Maria", "Anna", "Petr", "N", null));
    }


    public static void example(Collection<String> names) {
        List<Character> chars = names.stream()
                .filter(Objects::nonNull)
                .filter(name -> name.length() > 3)
                .map(String::toLowerCase)
                .flatMapToInt(String::chars)
                .sorted()
                .distinct()
                .skip(2)
                .limit(3)
                .boxed()
                .map(ch -> ((char) ((int) ch)))
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (Character aChar : chars) {
            sb.append((char)aChar).append(" ");
        }
        System.out.println(sb);
    }
}
