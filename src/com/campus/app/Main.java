package com.campus.app;

import com.campus.model.Student;
import com.campus.service.StudentService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student id: ");
        int studentid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        String studentname = sc.nextLine();
        System.err.print("Enter student age: ");
        int studentage = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student department: ");
        String studentdepartment = sc.nextLine();
        System.out.println("Number of subjects : ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks of " + n + " subjects: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        Student student = new Student(studentid, studentname, studentage, studentdepartment, marks);
        student.displayStudentInfo(true);
        student.displayStudentCount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        sc.close();
    }
}