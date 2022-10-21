package org.katalyst.interview.problems.third;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {

    /**
     *
     * @param one
     * @param two
     * @return
     */
    public static Boolean areAnagram(String one, String two){
        String stringOneSorted = Stream.of(one.split(""))
                .sorted().collect(Collectors.joining());

        String stringTwoSorted = Stream.of(two.split(""))
                .sorted().collect(Collectors.joining());

        return stringOneSorted.equals(stringTwoSorted);
    }

    public static void main(String[] args) {
        System.out.println(Anagrams.areAnagram("abba", "baba"));
        System.out.println(Anagrams.areAnagram("angel", "glean"));
        System.out.println(Anagrams.areAnagram("mummy", "yummy"));
        System.out.println(Anagrams.areAnagram("ant", "tangent"));
    }

}
