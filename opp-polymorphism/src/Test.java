public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        //调用成员变量:编译看左边，运行看左边
        System.out.println(a.name);
        //调用成员方法:编译看左边，运行看右边(覆盖虚方法表)
        a.show();

    }
}

class Animal{
    String name = "Animal";
    public void show(){
        System.out.println("Animal --- show方法");
    }
}

class Dog extends Animal{
    String name = "Dog";
    public void show(){
        System.out.println("Dog --- show方法");
    }
}

class Cat extends Animal{
    String name = "Cat";
    public void show(){
        System.out.println("Cat --- show方法");
    }
}
