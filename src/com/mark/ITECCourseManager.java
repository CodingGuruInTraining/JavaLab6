package com.mark;

import java.util.ArrayList;

/**
 * This program creates ITECCourse classes and assigns attributes to them.
 */
public class ITECCourseManager {
    public static void main(String[] args) {
        // Creates new ArrayList to hold all course.
        ArrayList<ITECCourse> catalog = new ArrayList<>();
        // Creates an ITECCourse object.
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, 3020);
        // Adds students to object using its method.
        maintenanceCourse.addStudents("Anna");
        maintenanceCourse.addStudents("Bill");
        maintenanceCourse.addStudents("Carl");
        maintenanceCourse.removeStudent("Carl");
        // Runs method to display contents of object.
        maintenanceCourse.writeCourseInfo();
        // Adds object to ArrayList.
        catalog.add(maintenanceCourse);

        // Creates an ITECCourse object.
        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30, 3080);
        // Adds students to object using its method.
        datacomCourse.addStudents("Dave");
        datacomCourse.addStudents("Ed");
        datacomCourse.addStudents("Flora");
        // Runs method to display contents of object.
        datacomCourse.writeCourseInfo();
        // Adds object to ArrayList.
        catalog.add(datacomCourse);

        // Creates an ITECCourse object.
        ITECCourse javaCourse = new ITECCourse("Java Programming", 2545, 24, 3010);
        // Adds students to object using its method.
        javaCourse.addStudents("Gus");
        javaCourse.addStudents("Harry");
        javaCourse.addStudents("Izzy");
        // Runs method to display contents of object.
        javaCourse.writeCourseInfo();
        // Adds object to ArrayList.
        catalog.add(javaCourse);

        // Creates an ITECCourse object.
        ITECCourse smallCourse = new ITECCourse("Fake Class 101", 1234, 3, 30000);
        // Adds students to object using its method.
        smallCourse.addStudents("Jake");
        smallCourse.addStudents("Kirby");
        smallCourse.addStudents("Liam");
        smallCourse.addStudents("Marigold");
        // Runs method to display contents of object.
        smallCourse.writeCourseInfo();
        // Adds object to ArrayList.
        catalog.add(smallCourse);

        // Creates an ITECCourse object.
        ITECCourse infotechCourse = new ITECCourse("Info Tech Concepts", 1100, 30, 3050);
        // Adds students to object using its method.
        infotechCourse.addStudents("Max");
        infotechCourse.addStudents("Nancy");
        infotechCourse.addStudents("Orson");
        // Runs method to display contents of object.
        infotechCourse.writeCourseInfo();
        // Adds object to ArrayList.
        catalog.add(infotechCourse);

        // Loops over all ITECCourse objects and displays their room number and
        // number of free spaces left.
        for (ITECCourse course : catalog) {
            System.out.println(course.getName() + " in room #" + course.getRoom() +
            " currently has " + course.getFreeSpaces() + " free spaces for students.");
        }
    }
}
