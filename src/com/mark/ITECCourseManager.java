package com.mark;

/**
 * Created by hl4350hb on 3/1/2017.
 */
public class ITECCourseManager {
    public static void main(String[] args) {
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, 3020);

        maintenanceCourse.addStudents("Anna");
        maintenanceCourse.addStudents("Bill");
        maintenanceCourse.addStudents("Carl");

        maintenanceCourse.removeStudent("Carl");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30, 3080);

        datacomCourse.addStudents("Dave");
        datacomCourse.addStudents("Ed");
        datacomCourse.addStudents("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse javaCourse = new ITECCourse("Java Programming", 2545, 24, 3010);

        javaCourse.addStudents("Gus");
        javaCourse.addStudents("Harry");
        javaCourse.addStudents("Izzy");

        javaCourse.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Fake Class 101", 1234, 3, 30000);
        smallCourse.addStudents("Jake");
        smallCourse.addStudents("Kirby");
        smallCourse.addStudents("Liam");
        smallCourse.addStudents("Marigold");

        smallCourse.writeCourseInfo();

        ITECCourse infotechCourse = new ITECCourse("Info Tech Concepts", 1100, 30, 3050);
        infotechCourse.addStudents("Max");
        infotechCourse.addStudents("Nancy");
        infotechCourse.addStudents("Orson");

        infotechCourse.writeCourseInfo();
    }
}
