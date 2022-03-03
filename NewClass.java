/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validation.newpackage;

import java.io.File;

/**
 *
 * @author tashana
 */
public class NewClass {
    public static void main(String[] args) {
        File myFile=new File("MIT/2018/MITTest");
        
        System.out.println(myFile.exists());
        
        myFile.mkdir();
        
        System.out.println(myFile.exists());
    }

}
