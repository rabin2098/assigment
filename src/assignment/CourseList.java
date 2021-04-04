/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class CourseList {

    public static void addCourse(ArrayList<Course> t) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course ID: ");
        String ID = scanner.nextLine();
        System.out.println("Enter course name: ");
        String name = scanner.nextLine();
        System.out.println("Enter credit: ");
        int credit = scanner.nextInt();
        t.add(new Course(ID, name, credit));

    }

    public static Course getCourseByID(ArrayList<Course> t, String id) {
        for (Course course : t) {
            if (id.equalsIgnoreCase(course.getID())) {
                course.display();
            }
        }
        return null;
 
    }

    public static void search(ArrayList<Course> t) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("search course by ID:");
        String id = scanner.nextLine();
        CourseList.getCourseByID(t, id);

    }
    public static void listall(ArrayList<Course> t){
        System.out.println("CourseID"+"\t"+"CourseName"+"\t"+"Credit");
        for (Course course : t) {
            printcourse(course);
        }
    }
    public static void printcourse(Course course){
        System.out.println(course.getID()+ "\t\t" +course.getName()+"\t\t" +course.getCredit());
    }
    public static void sort(ArrayList<Course> t){
        for (Course course : t) {
            printcourse(course);
        }
    }
    public static void update(ArrayList<Course> t){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course ID: ");
        String id = scanner.nextLine();
        Course o = getCourseByID(t, id);
        System.out.println("update course ID");
        String updateid = scanner.nextLine();
        System.out.println("update course name: ");
        String updatename = scanner.nextLine();
        System.out.println("update course credit: ");
        int updatecredit = scanner.nextInt();
        o.setID(updateid);
        o.setName(updatename);
        o.setCredit(updatecredit);
        System.out.println("Update succesfully");
    }

}
