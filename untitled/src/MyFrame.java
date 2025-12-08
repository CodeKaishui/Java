import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyFrame extends JFrame {
    private BackGround backGround;
    // 地面相关常量
    private static final int G_Y = 425;
    private static final int SOIL_SIZE = 28;

    public MyFrame() {
        //窗口初始化
        initFrame();
        //初始化静态资源
        StaticValue.init();
        //初始化障碍物图片数组
        BufferedImage[] obstacleImgs = {
                null,
                StaticValue.brisk2,
                StaticValue.brisk,
                StaticValue.pipe1,
                StaticValue.pipe2,
                StaticValue.pipe4
        };
        //初始化第一关背景
        backGround = new BackGround(1, obstacleImgs);
    }

    //窗口
    private void initFrame() {
        setTitle("超级玛丽");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 居中显示
        setResizable(false);
    }

    // 绘制所有游戏元素
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 1. 绘制背景图
        g.drawImage(StaticValue.bg, 0, 0, getWidth(), getHeight(), null);
        // 2. 绘制地面（草+泥土）
        drawGround(g);
        // 3. 绘制障碍物（砖块、水管）
        backGround.drawObstacles(g);
    }

    // 绘制地面
    private void drawGround(Graphics g) {
        // 绘制泥土
        if (StaticValue.soil_base != null) {
            for (int y = G_Y + SOIL_SIZE; y <= getHeight(); y += SOIL_SIZE) {
                for (int x = 0; x <= getWidth(); x += SOIL_SIZE) {
                    g.drawImage(StaticValue.soil_base, x, y, SOIL_SIZE, SOIL_SIZE, this);
                }
            }
        }
        // 绘制草
        if (StaticValue.soil_up != null) {
            for (int x = 0; x <= getWidth(); x += SOIL_SIZE) {
                g.drawImage(StaticValue.soil_up, x, G_Y, SOIL_SIZE, SOIL_SIZE, this);
            }
        }
    }


    public static void main(String[] args) {
        MyFrame gameFrame = new MyFrame();
        gameFrame.setVisible(true);
    }
}