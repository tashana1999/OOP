
package com.mycompany.employee;


public class EmployeeTest {
    public static void main(String[] args) {
   Employee employee1=new Employee();
     Employee employee2=new Employee();
   employee1.setFirstName("Amal");
    employee1.setLastName("Perera");
    employee1.setMonthlySalary(25000);
    employee2.setFirstName("Namal");
   employee2.setLastName("Silva");
    employee2.setMonthlySalary(20000);
    double Salary1=12*( employee1.getMonthlySalary());
    System.out.printf(employee1.getFirstName(),"");
      System.out.printf(employee1.getLastName(),"");
     System.out.println(Salary1);
    double Salary2=12*( employee2.getMonthlySalary());
     System.out.printf(employee2.getFirstName(),"");
      System.out.printf(employee2.getLastName(),"");
     System.out.println(Salary2);
    double raise1=1.10*Salary1;
    double raise2=1.10*Salary2;
System.out.printf(employee1.getFirstName(),"");
      System.out.printf(employee1.getLastName(),"");
     System.out.println(raise1);
 System.out.printf(employee2.getFirstName(),"");
      System.out.printf(employee2.getLastName(),"");
     System.out.println(raise2);
    
    

    

}


}
