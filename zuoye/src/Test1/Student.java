package Test1;

public class Student {
        // 公共属性
        public String name;
        public String school;
        public String major;
        protected String id;  // 受保护的，只有自己和子类能访问

        // 公共行为
        public void attendClass(String course) {
            System.out.println(name + "正在上" + course + "课");
        }

        public void work(String subject) {
            System.out.println(name + "正在做" + subject + "作业");
        }

        public void Exam(String course) {
            System.out.println(name + "正在参加" + course + "考试");
        }

        // 公共的获取信息方法
        public void Info() {
            System.out.println("大家好，我是" + name + "，在" + school + "学习" + major);
        }
    }
