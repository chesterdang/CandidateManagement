/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author danhv
 */
public class Fresher extends Candidate {
    private int yearOfGrad;
    private String rank;
    private String uni;
    
    public Fresher(String id, String firstName, String lastName, int birthDay, String address, String phone, String email, int canType, int yearOfGrad, String rank, String uni) {
        super(id, firstName, lastName, birthDay, address, phone, email, canType);
        this.yearOfGrad = yearOfGrad;
        this.rank = rank;
        this.uni = uni;
    }

    @Override
    public String toString() {
        return "Fresher{" + "yearOfGrad=" + yearOfGrad + ", rank=" + rank + ", uni=" + uni + '}';
    }

    public int getYearOfGrad() {
        return yearOfGrad;
    }

    public String getRank() {
        return rank;
    }

    public String getUni() {
        return uni;
    }
    
    
    
}
