package com.dmdev.hometask;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Anton", "Pypkin", 1, List.of(80, 90, 100, 70)),
                new Student("Ivan", "Ivanov", 2, List.of(85, 75, 60, 56, 88)),
                new Student("Inna", "Gaga", 1, List.of(50, 60)),
                new Student("Den", "Solncev", 2, List.of(90, 80, 70, 60, 100)),
                new Student("Eva", "Mendes", 3, List.of(90, 100, 85)),
                new Student("Artem", "Gor", 4, List.of())
        );
        // 1
        //  номер курса, без дублей, количество оценок  больше 3-х
        List<Integer> courseNumber = students.stream()
                .filter(student -> student.getEstimate().size() > 3)
                .map(Student::getCourseNumber)
                .distinct()
                .toList();
      System.out.println(courseNumber);
//
//        List<Integer> optionalDoubleStream = students.stream()
//                .filter(student -> student.getEstimate().size() > 3)  //количество оценок  больше 3-х
//                .flatMap(student -> student.getEstimate().stream())
//                .toList();
//
//        System.out.println(optionalDoubleStream);
//
//

        Map<Integer, List<Student>> studentsByCourse = students.stream()
                .filter(student -> student.getEstimate().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourseNumber));

        System.out.println(studentsByCourse);

        Map<Integer, Double> averageGradesByCourse = studentsByCourse.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,  // Ключ — это номер курса
                        entry -> entry.getValue().stream()  // Получаем поток студентов этого курса
                                .flatMap(student -> student.getEstimate().stream())  // Извлекаем оценки студентов
                                .mapToInt(Integer::intValue)  // Преобразуем оценки в int
                                .average()  // Вычисляем среднее
                                .orElse(0.0)  // Если среднее не получилось (например, пусто), ставим 0
                ));

        System.out.println(averageGradesByCourse);

        //2
        // Список студентов данного курса, но только с полями Имя и Фамилия.
        // Список должен быть отсортированы по этим двум полям

        Stream<Map.Entry<String, String>> studentsByCourse2 = studentsByCourse.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .map(student -> Map.entry(student.getName(), student.getSurname()))  //  пары (имя, фамилия)
                .sorted(Map.Entry.comparingByKey());

//!!! незнаю как отстортировать второй раз, по фамилии

        //3
        // Объект с двумя полями:
        //- Отсортированный список студентов с пункта 2
        //- Средняя оценка этих студентов

        Stream<Map.Entry<String, String>> sorted = studentsByCourse.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .map(student -> Map.entry(student.getName(), student.getSurname()))  //  пары (имя, фамилия)
                .sorted(Map.Entry.comparingByKey());


        OptionalDouble average = students.stream()
                .flatMap(student -> student.getEstimate().stream())
                        .mapToInt(Integer::intValue)
                        .average();





    }
}
