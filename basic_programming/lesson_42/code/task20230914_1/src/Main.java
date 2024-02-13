/*
Дан список студентов Student{ String name, int lessons}.
Необходимо сформировать Map<Integer, List<Student> >, где ключ кол-во уроков, а значение - список студентов
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ann", 13));
        students.add(new Student("Jack", 10));
        students.add(new Student("Nick", 7));
        students.add(new Student("Bill", 9));
        students.add(new Student("Lena", 13));
        students.add(new Student("John", 7));
        students.add(new Student("Ted", 7));

        System.out.println(listHandler(students));

    }

    public static Map<Integer, List<Student>> listHandler(List<Student> students){
        Map<Integer, List<Student>> result = new HashMap<>();
        if(students==null) return result;
        for (Student student: students){
            int lessons = student.getLessons();
            List<Student> list = result.getOrDefault(lessons, new ArrayList<>());
            list.add(student);
            result.put(lessons,list);
        }


        return result;
    }

}