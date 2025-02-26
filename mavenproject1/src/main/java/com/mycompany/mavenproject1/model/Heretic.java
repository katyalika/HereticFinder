/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model;

import java.util.ArrayList;

/**
 *
 * @author lihac
 */
public class Heretic {
    public String name;
    public ArrayList<String> crime = new ArrayList<String>();
    public String place;
    public int id;
    public String danger_level;
    public static ArrayList<String> d_levels = new ArrayList<String>() {{
        add("Low"); add("Medium"); add("High"); add("Critical");
    }};
    
    
    public void Heretic() {
        
    }
}
