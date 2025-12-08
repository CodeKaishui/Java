package Test22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CourseManager {
    // HashSet存储（快速查找，不重复）
    private Set<String> courseSet;
    // TreeSet存储（自动排序）
    private TreeSet<String> sortedCourseSet;

    public CourseManager() {
        this.courseSet = new HashSet<>();
        this.sortedCourseSet = new TreeSet<>();
    }

    // 添加课程：利用set去重特性，添加到两个集合
    public void addCourse(String courseName) {
        courseSet.add(courseName);
        sortedCourseSet.add(courseName);
        System.out.println("课程添加成功：" + courseName);
    }

    // 检查课程是否存在
    public boolean checkCourseExists(String courseName) {
        return courseSet.contains(courseName);
    }

    // 遍历所有课程
    public void printCourses() {
        System.out.println("--- 课程列表 (有序 TreeSet) ---");
        // 使用 for-each 遍历有序集合
        for (String course : sortedCourseSet) {
            System.out.print(course + " ");
        }
        System.out.println();
    }
}
