package test02_de1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum Grade {
    A, B, C, D, E, F
}

class Student {
    int studentId;
    String fullName;
    Grade grade;

    public Student(int studentId, String fullName, Grade grade) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.grade = grade;
    }
}

public class Ex01 {
    public static Student[] getStudentsWithGradeA(Student[] students) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.grade == Grade.A) {
                result.add(student);
            }
        }
        return result.toArray(new Student[0]);
    }
    public static Student[] getStudentsWithDuplicateNames(Student[] students) {
        Map<String, Integer> nameCountMap = new HashMap<>();
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            nameCountMap.put(student.fullName, nameCountMap.getOrDefault(student.fullName, 0) + 1);
        }
        for (Student student : students) {
            if (nameCountMap.get(student.fullName) > 1) {
                result.add(student);
                nameCountMap.put(student.fullName, 0);
            }
        }
        return result.toArray(new Student[0]);
    }
    public static void main(String[] args) {
        Student[] students = {
            new Student(102, "Nam", Grade.C),
            new Student(103, "Bảo", Grade.F),
            new Student(104, "Hoàng", Grade.D),
            new Student(105, "Nguyên", Grade.B),
            new Student(107, "Vũ", Grade.F),
            new Student(109, "Lan", Grade.A),
            new Student(202, "Đạt", Grade.C),
            new Student(103, "Bảo", Grade.F),
            new Student(107, "Vũ", Grade.C),
            new Student(104, "Hoàng", Grade.B)
        };
        Student[] gradeAStudents = getStudentsWithGradeA(students);
        System.out.println("Students with Grade A:");
        for (Student student : gradeAStudents) {
            System.out.println(student.fullName);
        }
        Student[] duplicateNameStudents = getStudentsWithDuplicateNames(students);
        System.out.println("\nStudents name who have-learned data structure :");
        for (Student student : duplicateNameStudents) {
            System.out.println(student.fullName);
        }
    }
}
