package GpaCalculator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.*;
import java.util.List;

public class GpaCalculator1 extends JFrame {

    // Subject 클래스 (원본과 동일)
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

    // 등급별 점수 변환 (4.5/4.3)
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

    // GPA 계산
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

    static double convertToPercentage(double gpa45) {
        return (gpa45 / 4.5) * 100;
    }

    static double convertToFourScale(double gpa45) {
        return (gpa45 / 4.5) * 4.0;
    }

    static double calculatePercentile(double myGPA, List<Double> gpaList) {
        int count = 0;
        for (double gpa : gpaList) {
            if (gpa < myGPA) count++;
        }
        return 100.0 * count / gpaList.size();
    }

    // GUI 생성자
    public GpaCalculator1(List<Subject> subjectList) {
        setTitle("대학 GPA Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // GPA 계산
        double gpa45 = calculateGPA(subjectList, gradeToPoint45, false);
        double gpa43 = calculateGPA(subjectList, gradeToPoint43, false);
        double gpa4 = convertToFourScale(gpa45);
        double percent = convertToPercentage(gpa45);
        double gpa45_juniorSenior = calculateGPA(subjectList, gradeToPoint45, true);
        double totalCredits = subjectList.stream().mapToDouble(s -> s.credit).sum();

        // 상위 % 예시 데이터
        List<Double> gpasInMajor = Arrays.asList(3.2, 3.8, 4.1, 3.5, 4.2, gpa45);
        double percentile = calculatePercentile(gpa45, gpasInMajor);

        // 1. 과목별 상세 JTable
        String[] subjectCols = {"과목명", "학점", "등급", "점수", "학기"};
        Object[][] subjectData = new Object[subjectList.size()][5];
        for (int i = 0; i < subjectList.size(); i++) {
            Subject s = subjectList.get(i);
            double point = gradeToPoint45.getOrDefault(s.grade, 0.0);
            subjectData[i][0] = s.name;
            subjectData[i][1] = s.credit;
            subjectData[i][2] = s.grade;
            subjectData[i][3] = point;
            subjectData[i][4] = s.year + "-" + s.semester;
        }
        JTable subjectTable = new JTable(new DefaultTableModel(subjectData, subjectCols));
        JScrollPane subjectScroll = new JScrollPane(subjectTable);
        subjectTable.setRowHeight(25);

        // 2. 학기별 요약 JTable
        String[] semCols = {"연도-학기", "평균GPA", "이수학점"};
        // 학기별 그룹핑
        Map<String, List<Subject>> semesterMap = new TreeMap<>();
        for (Subject s : subjectList) {
            String key = s.year + "-" + s.semester;
            semesterMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        Object[][] semData = new Object[semesterMap.size()][3];
        int idx = 0;
        for (String sem : semesterMap.keySet()) {
            List<Subject> semSubjects = semesterMap.get(sem);
            double gpa = calculateGPA(semSubjects, gradeToPoint45, false);
            double credits = semSubjects.stream().mapToDouble(sub -> sub.credit).sum();
            semData[idx][0] = sem;
            semData[idx][1] = String.format("%.2f", gpa);
            semData[idx][2] = credits;
            idx++;
        }
        JTable semTable = new JTable(new DefaultTableModel(semData, semCols));
        JScrollPane semScroll = new JScrollPane(semTable);
        semTable.setRowHeight(25);

        // 3. 전체 요약 패널 (컬러, 굵은 글씨)
        JPanel summaryPanel = new JPanel();
        summaryPanel.setLayout(new GridLayout(0, 2, 10, 5));
        summaryPanel.setBackground(new Color(230, 242, 255));

        JLabel l1 = new JLabel("총 이수학점: " + String.format("%.1f", totalCredits));
        l1.setFont(l1.getFont().deriveFont(Font.BOLD));
        JLabel l2 = new JLabel("GPA (4.5): " + String.format("%.2f", gpa45));
        l2.setForeground(new Color(0, 102, 204));
        l2.setFont(l2.getFont().deriveFont(Font.BOLD, 16f));
        JLabel l3 = new JLabel("GPA (4.3): " + String.format("%.2f", gpa43));
        JLabel l4 = new JLabel("GPA (4.0): " + String.format("%.2f", gpa4));
        JLabel l5 = new JLabel("백분율: " + String.format("%.2f", percent) + "%");
        JLabel l6 = new JLabel("3~4학년 GPA (4.5): " + String.format("%.2f", gpa45_juniorSenior));
        JLabel l7 = new JLabel("학과 내 상위 %: " + String.format("%.2f", 100.0 - percentile) + "%");

        summaryPanel.add(l1); summaryPanel.add(l2);
        summaryPanel.add(l3); summaryPanel.add(l4);
        summaryPanel.add(l5); summaryPanel.add(l6);
        summaryPanel.add(l7);

        // 4. GPA ProgressBar (그래프 느낌)
        JProgressBar gpaBar = new JProgressBar(0, 450);
        gpaBar.setValue((int)(gpa45 * 100));
        gpaBar.setStringPainted(true);
        gpaBar.setForeground(new Color(0, 102, 204));
        gpaBar.setBackground(Color.WHITE);
        gpaBar.setString("GPA (4.5): " + String.format("%.2f", gpa45));

        // 5. GUI 배치
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("과목별 상세", subjectScroll);
        tabbedPane.addTab("학기별 요약", semScroll);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(gpaBar, BorderLayout.NORTH);
        topPanel.add(summaryPanel, BorderLayout.CENTER);

        getContentPane().setLayout(new BorderLayout(10, 10));
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        // 예시 과목 데이터
        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(new Subject("Data Structures", 3, "A+", 2, 1));
        subjectList.add(new Subject("AI", 3, "B0", 3, 2));
        subjectList.add(new Subject("Java", 2, "A0", 4, 1));
        subjectList.add(new Subject("OS", 3, "C+", 2, 2));
        subjectList.add(new Subject("Database", 2, "A0", 3, 1));

        SwingUtilities.invokeLater(() -> new GpaCalculator1(subjectList));
    }
}
