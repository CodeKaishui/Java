package Test1;

public class Test {
    public static void main(String[] args) {
        // 创建我自己这个对象
        me myself = new me();

        System.out.println("=== 公共形象 ===");
        // 大家都能看到的公共面
        myself.Info();
        myself.attendClass("Java程序设计");
        myself.work("java");

        // 展示个人独特的一面
        myself.showMySpecialty();
        myself.study();

        System.out.println("\n=== 在不同场景中的我 ===");
        // 展示多面性
        showDifferentRoles(myself);
    }

    public static void showDifferentRoles(me person) {
        // 在学校是学生
        System.out.println("在学校：");
        person.attendClass("java");
        person.Exam("java学习");

        // 在朋友眼中
        System.out.println("在朋友眼中：");
        person.study();

    }
    }


