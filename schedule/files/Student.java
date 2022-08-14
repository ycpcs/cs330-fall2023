/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs330;

public class Student {

    int id;
    String name;
    String major;

    public Student(int _id, String _name, String _major) {
        id = _id;
        name = _name;
        major = _major;
    }

    public String toString() {
        return String.format("Id: %d, Name: %s, Major: %s", id, name, major);
    }
}
