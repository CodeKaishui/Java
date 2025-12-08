package Demo01;

public class test6 {
    public static void main(String[] args) {
        double Area1 = getArea(4,5);
        double Area2 = getArea(6,7);
        if(Area1 > Area2){
            System.out.println("面积1大");
        }else {
            System.out.println("面积2大");
        }
    }
    public static double getArea(double  len,double width){
        return len * width;
    }

}
