package String;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentId;      //学号
    private String name;           //姓名
    private double[] scores;       //成绩
    private double averageScore;

    public Student(String studentId, String name, double[] scores) {
        this.studentId = studentId;
        this.name = name;
        this.scores = scores.clone();
        this.averageScore = calculateAverage();
    }

    // 计算平均分
    private double calculateAverage() {
        if (scores == null || scores.length == 0) return 0.0;
        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        return Math.round(sum / scores.length * 100) / 100.0; // 保留两位小数
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public double[] getScores() { return scores.clone(); }
    public double getAverageScore() { return averageScore; }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                                   // 1. 同一个引用
        if (obj == null || getClass() != obj.getClass()) return false; // 2. 类型不同
        Student other = (Student) obj;
        return Objects.equals(this.studentId, other.studentId);         // 3. 学号相同即相同
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("学号：").append(studentId).append("\n");
        sb.append("姓名：").append(name).append("\n");
        sb.append("各科成绩：").append(Arrays.toString(scores)).append("\n");
        sb.append("平均分：").append(String.format("%.2f", averageScore));
        return sb.toString();
    }
}
