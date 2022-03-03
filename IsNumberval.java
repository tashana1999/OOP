/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validation.newpackage;

/**
 *
 * @author tashana
 */
public class IsNumberval {
     public static void main (String[] args){
      String input="0779098820";
     System.out.println(valPhone(input));
}
public static boolean valPhone(String input){
return input.charAt(0)=='0'&& input.charAt(1)=='7'&& input.length()==10 && input.matches("[0-9+]");
}
}
