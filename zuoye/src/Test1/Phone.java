package Test1;

public class Phone extends Product {
    private String tell;
    public Phone(String name, double price, String describe ,String tell){
        super(name , price , describe);
        this.tell = tell;
    }

    public void all(){
        super.all();
        System.out.println("通话功能：" + tell);
    }

}
