
package com.mycompany.gradebook;


public class GradeBook {
    private String courseName;
    private String author;
    public GradeBook(String name)
    {
      courseName=name;
      
}

    GradeBook(String cS101_Introduction_to_Java_Programming, String sam_Smith) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void setCourseName(String name)
    {
      courseName=name;
      
}
   public String getCourseName()
 {
   return courseName;
}
public void setAuthorName(String name1)
    {
      author=name1;
}
   public String getAuthorName()
 {
   return author;
}
public void displayMessage()
{
  System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
   System.out.printf("This course is presented by\n%s!\n", getAuthorName()); 
  
}
}
