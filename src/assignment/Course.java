/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Course implements Comparable<Course> {

    String ID;
    String name;
    int credit;

    public Course() {

    }

    public Course(String ID, String name, int credit) {
        this.ID = ID;
        this.name = name;
        this.credit = credit;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void display() {
        System.out.println(ID + "\t" + name + "\t" + credit);
    }

    @Override
    public int compareTo(Course o) {
        return credit - o.credit;
    }

}
