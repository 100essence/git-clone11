
package GpaCalculator;

import java.util.*;

public class GpaCalculator {

    // 1. 과목 정보를 담는 클래스
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

    // 2. 등급별 점수 변환 (4.5/4.3)
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

    // 3. GPA 계산 함수
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

    // 4. GPA 변환 함수
    static double convertToPercentage(double gpa45) {
        return (gpa45 / 4.5) * 100;
    }

    static double convertToFourScale(double gpa45) {
        return (gpa45 / 4.5) * 4.0;
    }

    // 5. 학과 내 백분위 계산
    static double calculatePercentile(double myGPA, List<Double> gpaList) {
        int count = 0;
        for (double gpa : gpaList) {
            if (gpa < myGPA) count++;
        }
        return 100.0 * count / gpaList.size();
    }

    // [추가1] 과목별 상세 내역 출력
    public static void printSubjectDetails(List<Subject> subjects, Map<String, Double> scale) {
        System.out.println("\n[과목별 상세 내역]");
        System.out.printf("%-20s %-6s %-6s %-8s %-8s\n", "과목명", "학점", "등급", "점수", "학기");
        System.out.println("--------------------------------------------------------");
        for (Subject s : subjects) {
            double point = scale.getOrDefault(s.grade, 0.0);
            String semesterStr = s.year + "-" + s.semester;
            System.out.printf("%-20s %-6.1f %-6s %-8.2f %-8s\n",
                s.name, s.credit, s.grade, point, semesterStr);
        }
    }

    // [추가2] 학기별 요약 정보 출력
    public static void printSemesterSummary(List<Subject> subjects, Map<String, Double> scale) {
        System.out.println("\n[학기별 요약]");
        System.out.printf("%-8s %-10s %-10s\n", "연도-학기", "평균GPA", "이수학점");
        System.out.println("-----------------------------------");

        // 연도-학기별로 그룹핑
        Map<String, List<Subject>> semesterMap = new TreeMap<>();
        for (Subject s : subjects) {
            String key = s.year + "-" + s.semester;
            semesterMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        for (String sem : semesterMap.keySet()) {
            List<Subject> semSubjects = semesterMap.get(sem);
            double gpa = calculateGPA(semSubjects, scale, false);
            double credits = semSubjects.stream().mapToDouble(sub -> sub.credit).sum();
            System.out.printf("%-8s %-10.2f %-10.1f\n", sem, gpa, credits);
        }
    }

    // [추가3] 전체 요약 정보 출력
    public static void printOverallSummary(double gpa45, double gpa43, double gpa4, double percent, double totalCredits) {
        System.out.println("\n[전체 요약]");
        System.out.println("-----------------------------------");
        System.out.printf("총 이수학점: %.1f\n", totalCredits);
        System.out.printf("GPA (4.5): %.2f\n", gpa45);
        System.out.printf("GPA (4.3): %.2f\n", gpa43);
        System.out.printf("GPA (4.0): %.2f\n", gpa4);
        System.out.printf("백분율: %.2f%%\n", percent);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        List<Subject> subjectList = new ArrayList<>();

        // 예시 과목 입력
        subjectList.add(new Subject("Data Structures", 3, "A+", 2, 1));
        subjectList.add(new Subject("AI", 3, "B0", 3, 2));
        subjectList.add(new Subject("Java", 2, "A0", 4, 1));
        subjectList.add(new Subject("OS", 3, "C+", 2, 2));
        subjectList.add(new Subject("Database", 2, "A0", 3, 1));

        double gpa45 = calculateGPA(subjectList, gradeToPoint45, false);
        double gpa43 = calculateGPA(subjectList, gradeToPoint43, false);
        double gpa45_juniorSenior = calculateGPA(subjectList, gradeToPoint45, true);
        double gpa4 = convertToFourScale(gpa45);
        double percent = convertToPercentage(gpa45);
        double totalCredits = subjectList.stream().mapToDouble(s -> s.credit).sum();

        // [추가1] 과목별 상세 내역
        printSubjectDetails(subjectList, gradeToPoint45);

        // [추가2] 학기별 요약
        printSemesterSummary(subjectList, gradeToPoint45);

        // [추가3] 전체 요약
        printOverallSummary(gpa45, gpa43, gpa4, percent, totalCredits);

        // 기타 정보 출력
        System.out.printf("\n[기타 정보]\n");
        System.out.printf("[전체] GPA (4.5 scale): %.2f\n", gpa45);
        System.out.printf("[전체] GPA (4.3 scale): %.2f\n", gpa43);
        System.out.printf("[3~4학년] GPA (4.5 scale): %.2f\n", gpa45_juniorSenior);
        System.out.printf("변환 GPA (4.0 scale): %.2f\n", gpa4);
        System.out.printf("변환 GPA (Percentage): %.2f%%\n", percent);

        // 학과 내 상위 %
        List<Double> gpasInMajor = Arrays.asList(3.2, 3.8, 4.1, 3.5, 4.2, gpa45);
        double percentile = calculatePercentile(gpa45, gpasInMajor);
        System.out.printf("학과 내 상위 %%: %.2f%%\n", 100.0 - percentile);
    }
}