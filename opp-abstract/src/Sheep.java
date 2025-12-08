public class Sheep extends  Animal{

    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }


    @Override
    public void deed() {
        System.out.println("I am a sheep");
    }
}
