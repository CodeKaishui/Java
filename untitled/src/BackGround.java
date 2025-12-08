import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;


class BackGround {
    private int level; // 当前关卡
    private List<Obstacle> obstacleList; // 存储当前关卡所有障碍物
    // 障碍物图片数组
    private BufferedImage[] obstacleImages;


    // 构造方法：初始化关卡和障碍物图片
    public BackGround(int level, BufferedImage[] obstacleImages) {
        this.level = level;
        this.obstacleImages = obstacleImages;
        this.obstacleList = new ArrayList<>();
        initObstacles(); // 初始化当前关卡的障碍物
    }

    // 初始化对应关卡的障碍物
    private void initObstacles() {
        switch (level) {
            case 1:
                initLevel1();
                break;
            default:
                initLevel1();
        }
    }

    // 第一关障碍物初始化
    private void initLevel1() {
        // 砖块尺寸和水管尺寸常量
        final int BRICK_SIZE = 30;
        final int PIPE_WIDTH = 30;
        final int PIPE_HEIGHT = 25;

        // 砖块：x=120~150，y=300
        for (int x = 120; x <= 150; x += BRICK_SIZE) {
            obstacleList.add(new Obstacle(1, x, 300, BRICK_SIZE, BRICK_SIZE));
        }

        int[] bfX = {360, 390, 480, 510, 540};
        for (int x : bfX) {
            obstacleList.add(new Obstacle(1, x, 300, BRICK_SIZE, BRICK_SIZE));
        }
        // 砖块
        for (int x = 420; x <= 450; x += BRICK_SIZE) {
            obstacleList.add(new Obstacle(1, x, 240, BRICK_SIZE, BRICK_SIZE));
        }

        //橙色
        int[] orangeX = {300, 330, 420, 450, 570};
        for (int x : orangeX) {
            obstacleList.add(new Obstacle(2, x, 300, BRICK_SIZE, BRICK_SIZE));
        }


        obstacleList.add(new Obstacle(3, 620, 360, 30, 25));
        obstacleList.add(new Obstacle(4, 620, 360, 30, 25));

        for (int y = 385; y <= 600; y += 25) {
            obstacleList.add(new Obstacle(5, 620, y, 30, 25));
        }

    }

    // 仅绘制障碍物
    public void drawObstacles(Graphics g) {
        for (Obstacle obs : obstacleList) {
            BufferedImage img = obstacleImages[obs.getType()];
            if (img != null) {
                g.drawImage(img, obs.getX(), obs.getY(), obs.getWidth(), obs.getHeight(), null);
            }
        }
    }

    // 获取背景图
    private BufferedImage getBgImage() {
        return StaticValue.bg;
    }



}