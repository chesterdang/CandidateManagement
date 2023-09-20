/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author danhv
 */
public class Intern extends Candidate {
    private String major;
    private String semester;
    private String uni;
    
    public Intern(String id, String firstName, String lastName, int birthDay, String address, String phone, String email, int canType, String major, String semester, String uni) {
        super(id, firstName, lastName, birthDay, address, phone, email, canType);
        this.major = major;
        this.semester = semester;
        this.uni = uni;
    }

    public String getMajor() {
        return major;
    }

    public String getSemester() {
        return semester;
    }

    public String getUni() {
        return uni;
    }

    
    
    @Override
    public String toString() {
        return "Intern{" + "major=" + major + ", semester=" + semester + ", uni=" + uni + '}';
    }
    
    
}
