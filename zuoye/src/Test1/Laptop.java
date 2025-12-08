package Test1;

public class Laptop extends Product{
    private String Battery;
    public Laptop(String name, double price, String describe ,String Battery){
        super(name , price , describe);
        this.Battery = Battery;

    }
    public void all(){
        super.all();
        System.out.println("处理器：" + Battery);
    }

}
