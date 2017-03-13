package com.mark;

import java.util.ArrayList;

/**
 * This program defines a new Class for ITEC courses and attributes
 * of each course.
 */
public class ITECCourse {
    // Defines attributes variables.
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private int room;

    // Getters and Setters for attributes.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    // Constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, int... courseRoom) {
        // Sets attributes.
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        if (courseRoom != null) {
            this.room = courseRoom[0];
        }
    }

    public void addStudents(String studentName) {
        // Checks if student limit is reached before adding new student.
        if (students.size() == maxStudents) {
            System.out.println("Course is full - can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    public void removeStudent(String studentName) {
        // Checks if student is enrolled before removing.
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);
        }
    }

    public void writeCourseInfo() {
        // Displays information about course.
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Room: " + room);
        System.out.println("Students enrolled:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is " + maxStudents);
    }

    // Getter for number of students in course.
    public int getNumberOfStudents() {
        return this.students.size();
    }

    // Getter for number of free spaces left in course.
    public int getFreeSpaces() {
        int spaces = this.maxStudents - getNumberOfStudents();
        return spaces;
    }
}
