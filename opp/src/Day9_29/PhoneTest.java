package Day9_29;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setName("小米");
        p.setPrice(4999);
        System.out.println(p.getName());
        System.out.println(p.getPrice());

       p.call();;
       p.sendMessage();
    }
}
