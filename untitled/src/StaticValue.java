import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class StaticValue {
    // 背景图像
    public static BufferedImage bg;
    //土
    public static BufferedImage soil_base;
    //草
    public static BufferedImage soil_up;
   //砖
    public static BufferedImage brisk;
    public static BufferedImage brisk2;
    // 水管图像（顶部等不同部分）
    public static BufferedImage pipe1, pipe2, pipe3, pipe4;

    // 初始化所有静态资源图片
    public static void init() {
        try {
            bg = ImageIO.read(new File("D:\\code\\2025\\java\\untitled\\src\\bg.jpg"));
            soil_up = ImageIO.read(new File("D:\\code\\2025\\java\\untitled\\src\\cao.jpg"));
            soil_base = ImageIO.read(new File("D:\\code\\2025\\java\\untitled\\src\\tu.jpg"));
            brisk = ImageIO.read(new File("D:\\code\\2025\\java\\untitled\\src\\brick2.png"));
            brisk2 = ImageIO.read(new File("D:\\code\\2025\\java\\untitled\\src\\brisk.png"));
            pipe1 = ImageIO.read(new File("D:\\code\\2025\\java\\untitled\\src\\pipe1.jpg"));
            pipe2 = ImageIO.read(new File("D:\\code\\2025\\java\\untitled\\src\\pipe2.jpg"));
            pipe3 = ImageIO.read(new File("D:\\code\\2025\\java\\untitled\\src\\pipe3.jpg"));
            pipe4 = ImageIO.read(new File("D:\\code\\2025\\java\\untitled\\src\\pipe4.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("图片加载失败，请检查图片路径");
        }
    }
}