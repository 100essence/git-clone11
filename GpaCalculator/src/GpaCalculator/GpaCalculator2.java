package GpaCalculator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.*;
import java.util.List;

public class GpaCalculator2 extends JFrame {

    // 과목 정보 클래스
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

    // 등급별 점수 변환
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

    // GPA 계산 함수
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

    // --- GUI 변수 선언 (갱신을 위해 필드로 선언) ---
    private final List<Subject> subjectList;
    private final DefaultTableModel subjectModel;
    private final JTable subjectTable;
    private final DefaultTableModel semModel;
    private final JTable semTable;
    private final JLabel[] summaryLabels;
    private final JProgressBar gpaBar;

    // 생성자
    public GpaCalculator2(List<Subject> subjectList) {
        this.subjectList = subjectList;

        setTitle("대학 GPA Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 650);
        setLocationRelativeTo(null);

        // 1. 입력 패널
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField nameField = new JTextField(8);
        JTextField creditField = new JTextField(3);
        JComboBox<String> gradeBox = new JComboBox<>(new String[]{"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"});
        JTextField yearField = new JTextField(2);
        JTextField semesterField = new JTextField(1);
        JButton addButton = new JButton("과목 추가");

        inputPanel.add(new JLabel("과목명:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("학점:"));
        inputPanel.add(creditField);
        inputPanel.add(new JLabel("등급:"));
        inputPanel.add(gradeBox);
        inputPanel.add(new JLabel("연도:"));
        inputPanel.add(yearField);
        inputPanel.add(new JLabel("학기:"));
        inputPanel.add(semesterField);
        inputPanel.add(addButton);

        // 2. 과목별 상세 JTable
        String[] subjectCols = {"과목명", "학점", "등급", "점수", "학기"};
        subjectModel = new DefaultTableModel(subjectCols, 0);
        subjectTable = new JTable(subjectModel);
        JScrollPane subjectScroll = new JScrollPane(subjectTable);
        subjectTable.setRowHeight(25);

        // 기존 데이터 삽입
        for (Subject s : subjectList) {
            double point = gradeToPoint45.getOrDefault(s.grade, 0.0);
            subjectModel.addRow(new Object[]{s.name, s.credit, s.grade, point, s.year + "-" + s.semester});
        }

        // 3. 학기별 요약 JTable
        String[] semCols = {"연도-학기", "평균GPA", "이수학점"};
        semModel = new DefaultTableModel(semCols, 0);
        semTable = new JTable(semModel);
        JScrollPane semScroll = new JScrollPane(semTable);
        semTable.setRowHeight(25);

        // 4. 전체 요약 패널 (컬러, 굵은 글씨)
        JPanel summaryPanel = new JPanel();
        summaryPanel.setLayout(new GridLayout(0, 2, 10, 5));
        summaryPanel.setBackground(new Color(230, 242, 255));
        summaryLabels = new JLabel[7];
        for (int i = 0; i < summaryLabels.length; i++) {
            summaryLabels[i] = new JLabel();
            summaryPanel.add(summaryLabels[i]);
        }
        summaryLabels[1].setForeground(new Color(0, 102, 204));
        summaryLabels[1].setFont(summaryLabels[1].getFont().deriveFont(Font.BOLD, 16f));

        // 5. GPA ProgressBar
        gpaBar = new JProgressBar(0, 450);
        gpaBar.setStringPainted(true);
        gpaBar.setForeground(new Color(0, 102, 204));
        gpaBar.setBackground(Color.WHITE);

        // 6. 탭 패널
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("과목별 상세", subjectScroll);
        tabbedPane.addTab("학기별 요약", semScroll);

        // 7. 상단 패널
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(inputPanel, BorderLayout.NORTH);
        topPanel.add(gpaBar, BorderLayout.CENTER);
        topPanel.add(summaryPanel, BorderLayout.SOUTH);

        // 8. 전체 배치
        getContentPane().setLayout(new BorderLayout(10, 10));
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);

        // 9. 과목 추가 버튼 이벤트
        addButton.addActionListener(e -> {
            try {
                String name = nameField.getText().trim();
                double credit = Double.parseDouble(creditField.getText().trim());
                String grade = (String) gradeBox.getSelectedItem();
                int year = Integer.parseInt(yearField.getText().trim());
                int semester = Integer.parseInt(semesterField.getText().trim());
                if (name.isEmpty() || credit <= 0 || year <= 0 || semester <= 0) throw new Exception();
                Subject newSubject = new Subject(name, credit, grade, year, semester);
                subjectList.add(newSubject);
                double point = gradeToPoint45.getOrDefault(grade, 0.0);
                subjectModel.addRow(new Object[]{name, credit, grade, point, year + "-" + semester});
                // 입력창 초기화
                nameField.setText("");
                creditField.setText("");
                yearField.setText("");
                semesterField.setText("");
                // GPA, 요약, 그래프 등 새로고침
                refreshAll();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "입력값을 확인하세요.");
            }
        });

        // 10. 최초 요약/그래프/학기별 요약 갱신
        refreshAll();

        setVisible(true);
    }

    // GPA, 요약, 그래프, 학기별 요약 모두 새로고침
    private void refreshAll() {
        // GPA 계산
        double gpa45 = calculateGPA(subjectList, gradeToPoint45, false);
        double gpa43 = calculateGPA(subjectList, gradeToPoint43, false);
        double gpa4 = convertToFourScale(gpa45);
        double percent = convertToPercentage(gpa45);
        double gpa45_juniorSenior = calculateGPA(subjectList, gradeToPoint45, true);
        double totalCredits = subjectList.stream().mapToDouble(s -> s.credit).sum();
        List<Double> gpasInMajor = Arrays.asList(3.2, 3.8, 4.1, 3.5, 4.2, gpa45);
        double percentile = calculatePercentile(gpa45, gpasInMajor);

        // 전체 요약 라벨 갱신
        summaryLabels[0].setText("총 이수학점: " + String.format("%.1f", totalCredits));
        summaryLabels[1].setText("GPA (4.5): " + String.format("%.2f", gpa45));
        summaryLabels[2].setText("GPA (4.3): " + String.format("%.2f", gpa43));
        summaryLabels[3].setText("GPA (4.0): " + String.format("%.2f", gpa4));
        summaryLabels[4].setText("백분율: " + String.format("%.2f", percent) + "%");
        summaryLabels[5].setText("3~4학년 GPA (4.5): " + String.format("%.2f", gpa45_juniorSenior));
        summaryLabels[6].setText("학과 내 상위 %: " + String.format("%.2f", 100.0 - percentile) + "%");

        // ProgressBar 갱신
        gpaBar.setValue((int) (gpa45 * 100));
        gpaBar.setString("GPA (4.5): " + String.format("%.2f", gpa45));

        // 학기별 요약 갱신
        semModel.setRowCount(0); // 기존 행 삭제
        Map<String, List<Subject>> semesterMap = new TreeMap<>();
        for (Subject s : subjectList) {
            String key = s.year + "-" + s.semester;
            semesterMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        for (String sem : semesterMap.keySet()) {
            List<Subject> semSubjects = semesterMap.get(sem);
            double gpa = calculateGPA(semSubjects, gradeToPoint45, false);
            double credits = semSubjects.stream().mapToDouble(sub -> sub.credit).sum();
            semModel.addRow(new Object[]{sem, String.format("%.2f", gpa), credits});
        }
    }

    public static void main(String[] args) {
        // 예시 과목 데이터
        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(new Subject("Data Structures", 3, "A+", 2, 1));
        subjectList.add(new Subject("AI", 3, "B0", 3, 2));
        subjectList.add(new Subject("Java", 2, "A0", 4, 1));
        subjectList.add(new Subject("OS", 3, "C+", 2, 2));
        subjectList.add(new Subject("Database", 2, "A0", 3, 1));

        SwingUtilities.invokeLater(() -> new GpaCalculator2(subjectList));
    }
}
