package org.katalyst.interview.problems.third;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {

    /**
     * Evaluate 2 String to determine if they're anagrams.
     * @param first String to be compared
     * @param second String to be compared
     * @return True for anagram, false if not.
     */
    public static Boolean areAnagram(String first, String second){
        String stringOneSorted = Stream.of(first.split(""))
                .sorted().collect(Collectors.joining());

        String stringTwoSorted = Stream.of(second.split(""))
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
