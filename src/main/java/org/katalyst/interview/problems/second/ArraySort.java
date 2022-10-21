package org.katalyst.interview.problems.second;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySort {

    /**
     *
     * @param values
     * @param top
     * @return
     */
    public static List<Integer> topValues(List<Integer> values, Integer top){
        return values.stream()
                .sorted(Comparator.reverseOrder())
                .limit(top)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> integers = ArraySort
                .topValues(Arrays.asList(2, 12, 1, 9, 6), 3);

        System.out.println(integers);
    }

}
