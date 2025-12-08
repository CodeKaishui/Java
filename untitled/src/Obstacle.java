import java.awt.*;
import java.awt.image.BufferedImage;

public class Obstacle {
    // 障碍物类型
    private int type;
    // 障碍物位置和尺寸
    private int x;
    private int y;
    private int width;
    private int height;

    // 构造方法：初始化障碍物信息
    public Obstacle(int type, int x, int y, int width, int height) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // getter方法（供外部获取属性）
    public int getType() { return type; }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}
