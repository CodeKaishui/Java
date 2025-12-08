package String;

import java.util.Random;

public class StudentDataGenerator {
    private static final String[] SURNAMES = {"张", "李", "王", "刘", "陈", "杨", "赵", "黄"};
    private static final String[] GIVEN_NAMES = {"明", "伟", "芳", "秀英", "强", "磊", "洋", "勇"};

    private final Random random;
    private final int subjectCount;   // 科目数量

    public StudentDataGenerator(int subjectCount, long seed) {
        this.random = new Random(seed);
        this.subjectCount = subjectCount;
    }

    public StudentDataGenerator(int subjectCount) {
        this(subjectCount, System.nanoTime());
    }

    // 生成学号
    public String generateStudentId(int sequence) {
        return String.format("%d%03d", 2025, sequence);
    }

    // 随机生成中文姓名
    public String generateChineseName() {
        String surname = SURNAMES[random.nextInt(SURNAMES.length)];
        String givenName = GIVEN_NAMES[random.nextInt(GIVEN_NAMES.length)];
        return surname + givenName;
    }

    // 随机生成各科成绩60~100
    public double[] generateScores() {
        double[] scores = new double[subjectCount];
        for (int i = 0; i < subjectCount; i++) {
            scores[i] = 60 + random.nextInt(41);
        }
        return scores;
    }

    // 生成一个完整的 Student 对象
    public Student generateStudent(int sequence) {
        String id = generateStudentId(sequence);
        String name = generateChineseName();
        double[] scores = generateScores();
        return new Student(id, name, scores);
    }

    // 批量生成 n 个学生
    public Student[] generateStudents(int count) {
        Student[] students = new Student[count];
        for (int i = 0; i < count; i++) {
            students[i] = generateStudent(i + 1);
        }
        return students;
    }
}
