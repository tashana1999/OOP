/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car;

/**
 *
 * @author tashana
 */
public class ManualCar implements Car {
    private String CarType="Manual";
    public void turnOnCar(){
     System.out.println("turn on the Manual car");
};
		public void turnOffCar(){
System.out.println("turn off the Manual car");
};
		public String getCarType(){
return this.CarType;
}}

