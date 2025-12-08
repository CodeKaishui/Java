package Test1;

public class Tablet extends Product {
    private String chumo;
    public Tablet(String name, double price, String describe ,String chumo){
        super(name , price , describe);
        this.chumo = chumo;
    }

    public void all(){
        super.all();
        System.out.println("触摸功能：" + chumo);
    }

}
