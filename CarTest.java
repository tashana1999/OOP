/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car;

/**
 *
 * @author tashana
 */
public class CarTest {
 public static void main(String[] args) {

Car car1=new ManualCar()   ;
Car car2=new AutomaticCar()  ;
car1.turnOnCar();
car1.turnOffCar();
System.out.println(car1.getCarType());
car2.turnOnCar();
car2.turnOffCar();
System.out.println(car2.getCarType());

}
    
}
