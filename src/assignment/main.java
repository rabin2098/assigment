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
public class main {

    public static void main(String[] args) {

        ArrayList<Course> t = new ArrayList<Course>();
        t.add(new Course("PRO192", "Object-Oriented Programming", 3));
        t.add(new Course("PRF192", "Programming Fundamentals", 5));
        int  choice;
        Scanner h = new Scanner(System.in);
        while (true) {
            System.out.println("1.A list of all available courses in the system");
            System.out.println("2.Search and display information of a course by courseID ");
            System.out.println("3.Record/add information of course ");
            System.out.println("4.Sort all course by Credit ");
            System.out.println("5.update information of a specific course (by course id)");
            System.out.println("0.Exit ");

            choice = h.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {

                case 1:
                    CourseList.listall(t);
                    break;
                case 2:
                    CourseList.search(t);
                    break;
                case 3:
                    CourseList.addCourse(t);
                    break;
                case 4:
                    CourseList.sort(t);
                    break;
                case 5:
                    CourseList.update(t);
                    break;
            }
        }
    }
}
