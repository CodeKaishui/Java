package Test22;

public class Main {
    public static void main(String[] args) {
        // 1. 初始化管理器
        StudentManager sm = new StudentManager();
        CourseManager cm = new CourseManager();
        GradeManager gm = new GradeManager();

        System.out.println("========== 1. 学生管理测试 ==========");
        // 添加学生
        Student s1 = new Student("S001", "张三", "计算机1班", 20);
        Student s2 = new Student("S002", "李四", "计算机1班", 19);
        Student s3 = new Student("S001", "张三(重复)", "计算机1班", 20); // 测试重复ID

        sm.addStudent(s1);
        sm.addStudent(s2);
        sm.addStudent(s3); // 应该失败

        sm.printAllStudents();

        // 删除学生
        sm.deleteStudent("S002");
        sm.printAllStudents();

        System.out.println("\n========== 2. 课程管理测试 ==========");
        // 添加课程 (测试排序：Java, C++, Python)
        cm.addCourse("Java程序设计");
        cm.addCourse("C++语言");
        cm.addCourse("Python数据分析");

        System.out.println("课程 'Java程序设计' 是否存在? " + cm.checkCourseExists("Java程序设计"));
        cm.printCourses();

        System.out.println("\n========== 3. 成绩管理测试 ==========");
        // 录入成绩
        // 张三 (S001) 的成绩
        gm.addGrade(new Grade("S001", "Java程序设计", 90.0));
        gm.addGrade(new Grade("S001", "C++语言", 85.5));

        // 查询成绩
        gm.printStudentGrades("S001");

        // 查询不存在的学生的成绩
        gm.printStudentGrades("S999");
    }
}
