/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.model.Heretic;

/**
 *
 * @author lihac
 */


public class Control {
    private HereticFactory factory;
    
    public Control() {
        HereticFactory factory = new HereticFactory();
    }
    public Heretic createHeretic(){
        return factory.createHeretic(); 
    }
}
