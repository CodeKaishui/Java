package Test22;

import java.util.Objects;

public class Grade {
    private String studentId;
    private String courseName;
    private double score;

    public Grade(String studentId, String courseName, double score) {
        this.studentId = studentId;
        this.courseName = courseName;
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getScore() {
        return score;
    }

    // 重写toString，使用String.format
    @Override
    public String toString() {
        return String.format("学号: %s, 课程: %s, 成绩: %.2f", studentId, courseName, score);
    }

    // 重写equals，根据studentId和courseName判断
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return Objects.equals(studentId, grade.studentId) &&
                Objects.equals(courseName, grade.courseName);
    }

    // 重写hashCode，使用Objects.hash(studentId, courseName)
    @Override
    public int hashCode() {
        return Objects.hash(studentId, courseName);
    }
}
