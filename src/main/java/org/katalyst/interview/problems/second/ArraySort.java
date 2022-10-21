package org.katalyst.interview.problems.second;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySort {

    /**
     * Get top values from the list after its sorted.
     * @param values List to be sorted and limited
     * @param top How many values from the list will be returned
     * @return New List with the top values in it.
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
