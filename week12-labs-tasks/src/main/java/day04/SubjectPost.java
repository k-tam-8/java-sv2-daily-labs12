package day04;

public class SubjectPost {
    private String name;
    private String subject;
    private String className;
    private int lessonByWeek;

    public SubjectPost(String name, String subject, String className, int lessonByWeek) {
        this.name = name;
        this.subject = subject;
        this.className = className;
        this.lessonByWeek = lessonByWeek;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassName() {
        return className;
    }

    public int getLessonByWeek() {
        return lessonByWeek;
    }

    @Override
    public String toString() {
        return "SubjectPost{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", className='" + className + '\'' +
                ", lessonByWeek=" + lessonByWeek +
                '}';
    }
}
