package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MovieFileReader {
    // 读取电影文件信息，演示异常捕获机制
    public void readMovieFile(String fileName) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(fileName);
            Scanner scanner = new Scanner(fis);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("电影信息: " + line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("错误: 电影文件 '" + fileName + "' 不存在");

        } catch (IOException e) {
            System.out.println("错误: 电影文件 '" + fileName + "' 读取错误");

        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("错误: 文件关闭失败");
            }
        }
    }
}
