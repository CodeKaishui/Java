package Exception;

import java.io.File;
import java.io.FileNotFoundException;

public class MovieResourceLoader {
    private String resourcePath;

    public MovieResourceLoader(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public void loadMovieResource() throws FileNotFoundException, SecurityException {

        File movieFile = new File(resourcePath);

        // 文件不存在
        if (!movieFile.exists()) {
            throw new FileNotFoundException("错误: 文件 '" + resourcePath + "' 不存在");
        }

        // 无权限读取
        if (!movieFile.canRead()) {
            throw new SecurityException("安全错误: 无权限读取文件 '" + resourcePath + "'");
        }

        System.out.println("成功加载电影资源: " + movieFile.getName());
    }
}
