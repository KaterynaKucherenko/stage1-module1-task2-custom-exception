package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws MyException{
    if (studentID<1 || studentID>10) throw new MyException(studentID);
    return Student.getValueOf(studentID);
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    try{
      for (int i = 1; i < IDs.length; i++) {
      Student student = manager.find(i);
      System.out.println("Student name " + student.getName());}}
      catch (MyException e){
        System.out.println(e.getMessage());
      }
    }}

