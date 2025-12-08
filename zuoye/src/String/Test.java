package String;

public class Test {
    public static void main(String[] args) {
        // 1. 生成 10 个学生（
        StudentDataGenerator generator = new StudentDataGenerator(5);
        Student[] students = generator.generateStudents(10);

        System.out.println("========== 学生成绩报告 ==========");
        for (Student s : students) {
            System.out.println(s);
            System.out.println("-".repeat(40));
        }

        // 2.equals()
        System.out.println("\nequals()");
        Student s1 = generator.generateStudent(1);   // 学号
        Student s2 = generator.generateStudent(999); // 不同学号
        Student s3 = new Student("2025001", "张三", new double[]{88, 90, 92, 85, 95});

        System.out.println("s1 和 s3 学号相同 → equals ? " + s1.equals(s3)); // true
        System.out.println("s1 和 s2 学号不同 → equals ? " + s1.equals(s2)); // false

        // 3. 如果不重写 equals/toString 会怎样？
        System.out.println("\n【不重写 equals/toString 的默认行为】");
        Object obj = new Object();
        System.out.println("默认 toString(): " + obj.toString());
        System.out.println("默认 equals(同一个对象): " + obj.equals(obj));
        System.out.println("默认 equals(不同对象): " + obj.equals(new Object()));

    }
}
