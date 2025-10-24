package ermolich_homework.task_11;

public interface Robot {

    void on();
    void  off();
    void uniquePossibility();

    default void repair() {
        System.out.println("отремонтировать робота");
    }

}
