/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author danhv
 */
public class Experience extends Candidate{
    private int yearOfEx;
    private String proSkill;
    
    public Experience(String id, String firstName, String lastName, int birthDay, String address, String phone, String email, int canType, int yearOfEx, String proSkill) {
        super(id, firstName, lastName, birthDay, address, phone, email, canType);
        this.yearOfEx = yearOfEx;
        this.proSkill = proSkill;
    }

    public int getYearOfEx() {
        return yearOfEx;
    }

    public String getProSkill() {
        return proSkill;
    }

    
    
    
}
