/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Library;
import java.util.ArrayList;

/**
 *
 * @author danhv
 */
public class CandidateList {
    private String id, firstName, lastName,phone, address, email, rank, uni, major, semester, proSkill;
    private int birthDay,  canType, yearOfGrad, yearOfEx;
    private ArrayList<Candidate> list;
    private Library lib = new Library();
    public CandidateList(ArrayList<Candidate> list) {
        this.list = list;
    }
    
    public CandidateList() {
        this.list = new ArrayList<Candidate>();
    }
    
    public void createCandidate() {
        id = lib.getString("Enter candidate id: ");
        firstName = lib.getString("Enter first name: ");
        lastName = lib.getString("Enter last name: ");
        birthDay = lib.getInt("Enter birthDay: ", 1900, 2023);
        address = lib.getString("Enter address: ");
        phone = lib.getPhone("Enter phone number: ");
        email = lib.getString("Enter email: "); 
    }
    public void addExperience() {
        createCandidate();
        yearOfEx =  lib.getInt("Enter year of experience: ", 0, 100);
        proSkill = lib.getString("Enter professional skill: ");
        canType = 0;
        list.add(new Experience(id, firstName, lastName, birthDay, address, phone, email, canType,yearOfEx, proSkill));
        System.out.println("---------Create Success----------");
        String choice = lib.getString("Do you want to continue (Y/N)? ");
        if (choice.equalsIgnoreCase("y")) {
            addExperience();
        } 
    } 
    public void addFresher() {
        createCandidate();
        yearOfGrad = lib.getInt("Enter year of graduation: ", 1900, 2023);
        rank = lib.getString("Enter rank: ");
        uni = lib.getString("Enter university: ");
        canType = 1;
        list.add(new Fresher(id, firstName, lastName, birthDay, address, phone, email, canType, yearOfGrad, rank, uni));
        System.out.println("---------Create Success----------");
        String choice = lib.getString("Do you want to continue (Y/N)? ");
        if (choice.equalsIgnoreCase("y")) {
            addFresher();
        }
    }
    public void addIntern() {
        createCandidate();
        major = lib.getString("Enter major: ");
        semester = lib.getString("Enter semester: ");
        uni = lib.getString("Enter university: ");
        canType = 2;
        list.add(new Intern(id, firstName, lastName, birthDay, address, phone, email, canType, major, semester, uni));
        System.out.println("---------Create Success----------");
        String choice = lib.getString("Do you want to continue (Y/N)? ");
        if (choice.equalsIgnoreCase("y")) {
            addIntern();
        }
    }
    
    public void printList() {
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("=========EXPERIENCE CANDIDATES==========");
            for (Candidate candidate : list) {
                if (candidate instanceof Experience) {
                    System.out.println(candidate.getFirstName() + " " +candidate.getLastName());
                }
            }

            System.out.println("=========FRESHER CANDIDATES==========");
            for (Candidate candidate : list) {
                if (candidate instanceof Fresher) {
                    System.out.println(candidate.getFirstName() + " " +candidate.getLastName());
                }
            }

            System.out.println("=========INTERN CANDIDATES==========");
            for (Candidate candidate : list) {
                if (candidate instanceof Intern) {
                    System.out.println(candidate.getFirstName() + " " +candidate.getLastName());
                }
            }

        }
}
    
    public void searchList() {
         if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            printList();
            String name = lib.getString("Input Candidate name (First name of last name): ");
            int type = lib.getInt("Input type of candidate: ", 0, 2);
            for (Candidate candidate : list) {
                if (candidate.getCanType() == type && (candidate.getFirstName().indexOf(name) != -1 || candidate.getLastName().indexOf(name) != -1)) {
                    System.out.println(candidate.toString());
                }
            }
        }
        
    }
    
}
