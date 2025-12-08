package Demo01;

public class test4 {
    public static void GetLen(double len,double width){
        double ret = (len + width) * 2;
        System.out.println(ret);
    }
    public static void GetCircle(double r){
        double ret = 3.14 * r * r;
        System.out.println(ret);
    }
    public static void main(String[] args) {
        GetLen(3.3,2.2);
        GetCircle(3.3);
    }
}
