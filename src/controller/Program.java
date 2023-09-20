/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import model.CandidateList;
import view.Menu;

/**
 *
 * @author danhv
 */
public class Program extends Menu<String> {
    static String[] searchChoice = {"1. Experience", "2. Fresher", "3. Intern", "4. Searching", "5. Exit"};
    protected Library lib;
    protected CandidateList list;
    
    public Program () {
        super("CANDIDATE MANAGEMENT SYSTEM", searchChoice);
        lib = new Library();
        list = new CandidateList();
    }

    @Override
    public void execute(int n) {
        int x;
        switch (n) {
            case 1: 
                list.addExperience();
                break;
            case 2: 
                list.addFresher();
                break;
            case 3: 
                list.addIntern();
                break;
            case 4: 
                list.searchList();
                break;
            case 5: 
                System.exit(0);
        }
    }
}
