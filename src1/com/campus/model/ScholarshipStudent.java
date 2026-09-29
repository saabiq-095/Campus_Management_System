package com.campus.model;

public class ScholarshipStudent extends Student {
    private double scholarshipPercentage;
    public ScholarshipStudent(int studentId, String studentName, int studentAge, String studentDepartment, int[] marks, double scholarshipPercentage) {
        super(studentId, studentName, studentAge, studentDepartment, marks);
        this.scholarshipPercentage = scholarshipPercentage;
    }

//getter
    public double getScholarshipPercentage() {
        return scholarshipPercentage;
    }

//setter
    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }

//implementing abstract method
    @Override
    public void studentType() {
        System.out.println("Scholarship Student");
    }
    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Scholarship Percentage: " + scholarshipPercentage + "%");
    }
}