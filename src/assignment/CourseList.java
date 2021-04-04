/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Dell
 */
public class CourseList {

    public static void addCourse(ArrayList<Course> courses) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course ID: ");
        String ID = scanner.nextLine();
        System.out.println("Enter course name: ");
        String name = scanner.nextLine();
        System.out.println("Enter credit: ");
        int credit = scanner.nextInt();
        courses.add(new Course(ID, name, credit));

    }

    private static Course getCourseByID(ArrayList<Course> courses, String id) {
        for (Course course : courses) {
            if (id.equalsIgnoreCase(course.getID())) {
                return course;
            }
        }
        return null;
    }

    public static void search(ArrayList<Course> courses) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("search course by ID:");
        String id = scanner.nextLine();
        Course course = getCourseByID(courses, id);
        course.display();
    }

    public static void listAll(ArrayList<Course> courses) {
        System.out.println("CourseID" + "\t" + "CourseName" + "\t" + "Credit");
        for (Course course : courses) {
            course.display();
        }
    }

    public static void sort(ArrayList<Course> courses) {
        for (Course course : courses) {
            course.display();
        }
    }

    public static void update(ArrayList<Course> courses) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course ID: ");
        String id = scanner.nextLine();
        Course o = getCourseByID(courses, id);
        System.out.println("update course ID");
        String updateId = scanner.nextLine();
        System.out.println("update course name: ");
        String updateName = scanner.nextLine();
        System.out.println("update course credit: ");
        int updateCredit = scanner.nextInt();
        o.setID(updateId);
        o.setName(updateName);
        o.setCredit(updateCredit);
        System.out.println("Update successfully");
    }

}
