package lesson5.exercise1.view;

import lesson5.exercise1.model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
