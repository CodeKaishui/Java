package Test22;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String studentId;
    private String name;
    private String className;
    private int age;

    public Student(String studentId, String name, String className, int age) {
        this.studentId = studentId;
        this.name = name;
        this.className = className;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // 重写toString方法，使用String.format
    @Override
    public String toString() {
        return String.format("学号: %s, 姓名: %s, 班级: %s, 年龄: %d", studentId, name, className, age);
    }

    // 重写equals，根据studentId判断
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    // 重写hashCode，使用Objects.hash(studentId)
    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    // 实现Comparable接口，比较studentId
    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
