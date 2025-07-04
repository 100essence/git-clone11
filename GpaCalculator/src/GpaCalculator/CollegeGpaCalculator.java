package GpaCalculator;

// GPA Calculator - Java Program (Step-by-Step Sample Code)

import java.util.*;

public class CollegeGpaCalculator {

    // 1. Subject class to hold course data
    static class Subject {
        String name;
        double credit;
        String grade;
        int year;
        int semester;

        Subject(String name, double credit, String grade, int year, int semester) {
            this.name = name;
            this.credit = credit;
            this.grade = grade;
            this.year = year;
            this.semester = semester;
        }
    }

    // 2. Grade conversion maps (4.5 and 4.3 scale)
    static Map<String, Double> gradeToPoint45 = Map.of(
        "A+", 4.5, "A0", 4.0,
        "B+", 3.5, "B0", 3.0,
        "C+", 2.5, "C0", 2.0,
        "D+", 1.5, "D0", 1.0,
        "F", 0.0
    );

    static Map<String, Double> gradeToPoint43 = Map.of(
        "A+", 4.3, "A0", 4.0,
        "B+", 3.3, "B0", 3.0,
        "C+", 2.3, "C0", 2.0,
        "D+", 1.3, "D0", 1.0,
        "F", 0.0
    );

    // 3. Calculate GPA given a scale and optional filter
    static double calculateGPA(List<Subject> subjects, Map<String, Double> scale, boolean onlyJuniorSenior) {
        double totalPoints = 0.0;
        double totalCredits = 0.0;

        for (Subject s : subjects) {
            if (onlyJuniorSenior && s.year < 3) continue;
            if (!scale.containsKey(s.grade)) continue;
            totalPoints += scale.get(s.grade) * s.credit;
            totalCredits += s.credit;
        }

        return (totalCredits > 0) ? totalPoints / totalCredits : 0.0;
    }

    // 4. Convert GPA to percentage or 4.0 scale (example)
    static double convertToPercentage(double gpa45) {
        return (gpa45 / 4.5) * 100;
    }

    static double convertToFourScale(double gpa45) {
        return (gpa45 / 4.5) * 4.0;
    }

    // 5. Ranking percentile calculation
    static double calculatePercentile(double myGPA, List<Double> gpaList) {
        int count = 0;
        for (double gpa : gpaList) {
            if (gpa < myGPA) count++;
        }
        return 100.0 * count / gpaList.size();
    }

    public static void main(String[] args) {
        List<Subject> subjectList = new ArrayList<>();

        // Example subjects
        subjectList.add(new Subject("Data Structures", 3, "A+", 2, 1));
        subjectList.add(new Subject("AI", 3, "B0", 3, 2));
        subjectList.add(new Subject("Java", 2, "A0", 4, 1));

        double gpa45 = calculateGPA(subjectList, gradeToPoint45, false);
        double gpa43 = calculateGPA(subjectList, gradeToPoint43, false);
        double gpa45_juniorSenior = calculateGPA(subjectList, gradeToPoint45, true);

        System.out.printf("[전체] GPA (4.5 scale): %.2f\n", gpa45);
        System.out.printf("[전체] GPA (4.3 scale): %.2f\n", gpa43);
        System.out.printf("[3~4학년] GPA (4.5 scale): %.2f\n", gpa45_juniorSenior);
        System.out.printf("변환 GPA (4.0 scale): %.2f\n", convertToFourScale(gpa45));
        System.out.printf("변환 GPA (Percentage): %.2f%%\n", convertToPercentage(gpa45));

        // Ranking example
        List<Double> gpasInMajor = Arrays.asList(3.2, 3.8, 4.1, 3.5, 4.2, gpa45);
        double percentile = calculatePercentile(gpa45, gpasInMajor);
        System.out.printf("학과 내 상위 %%: %.2f%%\n", 100.0 - percentile);
    }
}