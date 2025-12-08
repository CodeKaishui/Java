package Test22;

import java.util.HashMap;
import java.util.Map;

public class GradeManager {
    // Map<学号, Map<课程, 成绩>>
    private Map<String, Map<String, Double>> gradeMap;

    public GradeManager() {
        this.gradeMap = new HashMap<>();
    }

    // 添加成绩
    public void addGrade(Grade grade) {
        String sid = grade.getStudentId();
        String course = grade.getCourseName();
        double score = grade.getScore();

        // 如果该学生还没有成绩记录，先创建一个空的Map放进去
        gradeMap.putIfAbsent(sid, new HashMap<>());

        // 获取该学生的成绩Map，并存入课程和分数
        gradeMap.get(sid).put(course, score);
        System.out.println("成绩录入成功：" + grade);
    }

    // 查询学生所有成绩
    public void printStudentGrades(String studentId) {
        // 使用 getOrDefault 防止空指针
        Map<String, Double> studentGrades = gradeMap.getOrDefault(studentId, new HashMap<>());

        System.out.println("--- 学号 " + studentId + " 的成绩单 ---");
        if (studentGrades.isEmpty()) {
            System.out.println("暂无成绩记录。");
        } else {
            // 遍历Map
            for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
                System.out.println("课程: " + entry.getKey() + ", 成绩: " + entry.getValue());
            }
        }
    }
}
