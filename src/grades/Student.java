
package grades;

import java.util.ArrayList;



//1. Create a Student class
//
//Create a class named Student. It should have private properties for the student's name, and grades.
// The grades property should be an ArrayList of integers. The student class should have a constructor
// that sets name property, and initializes the grades property as an empty ArrayList. The Student class
// should have the following methods:
//// returns the student's name
//public String getName();
//// adds the given grade to the grades property
//public void addGrade(int grade);
//// returns the average of the students grades
//public double getGradeAverage();

public class Student {

    private String name;

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradeAll;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    // returns the student's name
    public String getName()
    { return this.name;

    }
    // adds the given grade to the grades property
    public void addGrade(int grade)
    { grades.add(grade);
    }
//    public void addAll(ArrayList<Integer> gradeAll){
//        gradeAll.addAll(grades);
//    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for (int i = 0; i<this.grades.size(); i++) {
            total += this.grades.get(i);
////        for (Integer grade : this.grades) {
//            total += grade;
        }
        return Math.round(total / this.grades.size());
    }



    // Test your Student class by adding a main method and creating Student objects.
    // Verify that you can add grades to each object, and that your getGradeAverage method correctly
    // returns the average of the student's grades.



}