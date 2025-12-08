package Test22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManager {
    // 使用ArrayList存储学生列表
    private List<Student> studentList;

    public StudentManager() {
        this.studentList = new ArrayList<>();
    }

    // 添加学生：遍历查找是否存在，不存在则添加
    public void addStudent(Student student) {
        for (Student s : studentList) {
            if (s.getStudentId().equals(student.getStudentId())) {
                System.out.println("添加失败：学号 " + student.getStudentId() + " 已存在。");
                return;
            }
        }
        studentList.add(student);
        System.out.println("学生添加成功：" + student.getName());
    }

    // 删除学生：使用Iterator遍历并删除
    public void deleteStudent(String studentId) {
        Iterator<Student> iterator = studentList.iterator();
        boolean found = false;
        // while (iterator.hasNext())
        while (iterator.hasNext()) {
            // E e = iterator.next();
            Student s = iterator.next();
            if (s.getStudentId().equals(studentId)) {
                // iterator.remove();
                iterator.remove();
                System.out.println("删除成功：学号 " + studentId);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("删除失败：未找到学号 " + studentId);
        }
    }

    // 查询所有学生：使用for-each循环
    public void printAllStudents() {
        System.out.println("--- 学生列表 ---");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
