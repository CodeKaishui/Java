package Exception;

public class MovieNotFoundException extends Exception{
    private String movieTitle;
    private String searchCriteria;

    public MovieNotFoundException(String movieTitle, String searchCriteria) {
        this.movieTitle = movieTitle;
        this.searchCriteria = searchCriteria;
    }

    @Override
    public String toString() {
        return "MovieNotFoundException[电影: " + movieTitle + ", 条件: " + searchCriteria + "]";
    }

    @Override
    public void printStackTrace() {
        System.out.println("自定义异常: 未找到匹配的电影资源");
        super.printStackTrace(); // 调用父类打印信息
    }
}
