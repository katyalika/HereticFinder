/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model;

import com.github.javafaker.Faker;

/**
 *
 * @author lihac
 */
public class DataGenerator {
    Faker faker = new Faker();
    
    public DataGenerator() {
    }
    
    public String createName() {
        return faker.name().firstName();
    }
    
}
