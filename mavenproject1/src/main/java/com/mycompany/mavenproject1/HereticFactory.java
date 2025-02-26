/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.model.DataGenerator;
import com.mycompany.mavenproject1.model.Heretic;

/**
 *
 * @author lihac
 */
public class HereticFactory {
    
    private DataGenerator generate = new DataGenerator();
    
    public HereticFactory() {
    }
    
    public Heretic createHeretic() {
        Heretic heretic = new Heretic();
        heretic.name = generate.createName(); 
        System.out.println(generate.createName());
        return heretic;
    }
}
