/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author danhv
 */
public class Candidate {
    protected String id;
    protected String firstName;
    protected String lastName;
    protected int birthDay;
    protected String address;
    protected String phone;
    protected String email;
    protected int canType;

    public Candidate(String id, String firstName, String lastName, int birthDay, String address, String phone, String email, int canType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.canType = canType;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getCanType() {
        return canType;
    }
    
    
   
    @Override
    public String toString() {
        return "Candidate{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDay=" + birthDay + ", address=" + address + ", phone=" + phone + ", email=" + email + ", canType=" + canType + '}';
    }
    
    
}
