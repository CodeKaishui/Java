package Test1;

public class main {
    public static void main(String[] args) {
        Phone phone = new Phone("智能手机", 4999,"触摸屏","5G");
        Tablet tablet = new Tablet("平板",7999,"触摸屏","全面触摸");
        Laptop laptop = new Laptop("拯救者",8999.99,"4K","I9");

        System.out.println("手机信息");
        phone.all();
        System.out.println("------------------------");
        System.out.println("平板信息");
        tablet.all();
        System.out.println("------------------------");
        System.out.println("笔记本信息");
        laptop.all();
    }
}

