package org.fasttrackit.homework.ex1;

import java.util.*;

public class MainStudent {
    public static void main(String[] args) {
        // Map = Set(keys) + List(values)
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Test2", 9);
        studentMap.put("Test6", 9);
        studentMap.put("Mihai", 8);
        studentMap.put("George", 10);
        studentMap.put("Marinela", 10);
        studentMap.put("Ana", 5);
        studentMap.put("Test1", 7);
        studentMap.put("Test3", 2);

        Integer heightsGrade = 0;
        List<String> studentsWithHeightsGrades = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            if (entry.getValue() > heightsGrade) {
                heightsGrade = entry.getValue();
                studentsWithHeightsGrades.clear();
                studentsWithHeightsGrades.add(entry.getKey());
            } else if (heightsGrade.equals(entry.getValue())) {
                studentsWithHeightsGrades.add(entry.getKey());
            }
        }

        System.out.println(studentsWithHeightsGrades);

        Map.Entry<String, Integer> max = Collections.max(studentMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
        System.out.println(max);
    }
}
