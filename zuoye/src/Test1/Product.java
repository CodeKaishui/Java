package Test1;

public class Product {
    private String name;
    private double price;
    private String describe;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double price, String describe) {
        this.name = name;
        this.price = price;
        this.describe = describe;
    }

    public void all(){
        System.out.println("产品名称:" + name);
        System.out.println("产品价格:" + price);
        System.out.println("产品描述:" + describe);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

}
