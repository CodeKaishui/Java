public class Dog extends  Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void deed() {
        System.out.println("吃骨头，喝水");
    }
}
