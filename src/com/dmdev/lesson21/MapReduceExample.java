package com.dmdev.lesson21;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {


    /** map = преобразование
     * [1000_000] -> age -> max
     * [1000_000] -> age -> max -> max
     * [1000_000] -> age -> max
     *
     */
    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(
                        new Student(18, "Ivan"),
                        new Student(23, "Pasha"),
                        new Student(34, "Dasha"),
                        new Student(45, "Julia"),
                        new Student(20, "Ira"),
                        new Student(68, "Den4ik"),
                        new Student(101, "Anton"),
                        new Student(93, "Maks"),
                        new Student(19, "Petr"),
                        new Student(23, "Inna")

                )
//                .parallel() // параллельный запуск
//                //.sequential() -- в один поток
//                .map(Student::getAge)
//                .reduce(Integer::sum)
//                .ifPresent(System.out::println);
       // .flatMap(student -> student.getMarks().stream());
             //   .ifPresentOrElse(System.out::println, System.out::println);
               // .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);


                .sequential()
                .filter(student -> student.getAge() < 18)
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);

        maybeStudent.ifPresent(System.out::println);
maybeStudent.map(Student::getAge)
        .filter(age -> age > 25)
        .ifPresentOrElse(System.out::println, System.out::println);
    }
}
