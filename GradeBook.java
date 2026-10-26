package com.demo.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Collections: List (ordered, allows duplicates), Set (no duplicates),
 * Map (key -> value).
 */
public class GradeBook {
    private final List<Integer> scores = new ArrayList<>();
    private final Map<String, Integer> studentScores = new HashMap<>();

    public void addScore(int score) {
        scores.add(score);
    }

    public List<Integer> getScores() {
        return scores;
    }

    public Set<Integer> uniqueScores() {
        return new HashSet<>(scores);
    }

    public double average() {
        if (scores.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }

    public void setStudentScore(String name, int score) {
        studentScores.put(name, score); // put again with same key replaces the value
    }

    public int getStudentScore(String name) {
        Integer score = studentScores.get(name);
        if (score == null) {
            throw new IllegalArgumentException("Unknown student: " + name);
        }
        return score;
    }
}
