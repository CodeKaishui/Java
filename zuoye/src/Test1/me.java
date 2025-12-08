package Test1;

public class me extends Student{
    // 私有属性
    private String hobby;

    // 受保护的属性
    protected String Book;

    // 构造方法
    public me() {
        this.name = "王士权";
        this.school = "河南开封科技传媒学院";
        this.major = "软件工程";
        this.id = "2536113079";
        this.hobby = "编程";  // 私有
        this.Book = "《xxx》";         // 受保护
    }

    // 公共方法
    public void study() {
        System.out.println(name + "正在专心学习编程，梦想是" + getDream());
    }

    // 私有方法
    private String getDream() {
        return "月薪过W";
    }

    // 展示个人特色的方法
    public void showMySpecialty() {
        System.out.println("=== 独特之处 ===");
        System.out.println("我的爱好：" + getHobby());
        System.out.println("喜爱的书籍：" + Book);
    }

    // 获取私有信息的提示
    private String getHobby() {
        return "热爱" + hobby.split("和")[0] + "等";
    }

}

